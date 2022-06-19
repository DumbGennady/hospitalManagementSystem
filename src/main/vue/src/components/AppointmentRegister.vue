<template>
  <div class="page">
      <h1> Register Appointment </h1>
      <div class="form">
          <div>
            <input type="text" v-model="patientId" id="patient-id" placeholder="Enter patient id"/>
            <button @click="getPatientDetails">Get patient</button>
          </div>
          <div>
            <label for="name">Name:</label>
            <input type="text" v-model="name" id="name"  disabled/>
          </div>
          <div>
            <label for="age">Age:</label>
            <input type="text" v-model="age" id="age" disabled/>
          </div>
          <!-- <div>
            <label for="blood-group">Blood Group:</label>
            <input type="text" v-model="bloodGroup" id="blood-group" disabled/>
          </div> -->
          <div>
            <label for="doctor">Doctor:</label>
            <select name="Select Doctor" id="doctors" v-model="doctorId" @change="getAvailableSlots">
              <option value="" disabled selected>Select doctor</option>
              <option v-for="doctor in doctors" :key="doctor.id" :value="doctor.id">Dr. {{doctor.name}} ({{doctor.specialisation}})</option>
            </select>
          </div>
          <div>
            <label for="appointment-date">Appointment Date:</label>
            <input type="date" v-model="appointmentDate" @input="getAvailableSlots" id="appointment-date" min="2022-01-01" max="2030-12-31"/>
          </div>
          <div>
            <label for="appointment-time">Appointment Time:</label>
            <select name="Select Appointment Time" id="appointment-time" v-model="appointmentTime">
              <option value="" disabled selected>Select appointment time</option>
              <option  v-for="appointmentTime in appointmentTimes" :key="appointmentTime.startTime" :value="appointmentTime" :disabled="appointmentTime.disabled">{{appointmentTime.startTime.substring(0, 5)}} - {{appointmentTime.endTime.substring(0, 5)}}</option>
            </select>
          </div>
          <div>
            <label for="description">Description:</label>
            <textarea rows="5" v-model="description" id="description" placeholder="Enter description"></textarea>
          </div>
      </div>
      <button @click="registerAppointment"> Register </button>
  </div>
</template>

<script>
export default {
    name: 'AppointmentRegister',
    data() {
        return {
            patientId: '',
            name: '',
            age: '',
            doctorId: '',
            appointmentTime : {},
            description: '',
            appointmentDate: '',
            doctors: {},
            appointmentTimes: []
        }
    },
    mounted() {
      this.getDoctors();
      this.setAppointmentTimes();
    },
    methods: {
      validateInput(){
          //To be done
          return true;
      },
      registerAppointment(){
          if(this.validateInput()){
              this.axios.post("http://localhost:9090/rest/appointment/insert",
              {
                patientId : this.patientId,
                doctorId : this.doctorId,
                date : this.appointmentDate,
                startTime : this.appointmentTime.startTime,
                endTime : this.appointmentTime.endTime,
                description : this.description
              }
              ).then(res => {
                  // if(res.data !== 1)this.$notify("Item cannot be added")
                  if(res.data === 1){
                    this.$router.push({name: 'PatientRegister'})
                    alert("Appointment successfully registered");
                    }
              }
          )}
      },
      getDoctors(){
        this.axios.get("http://localhost:9090/rest/doctor/list"
        ).then(res => {
          this.doctors = res.data;
        })
      },
      setAppointmentTimes(){
        this.appointmentTimes = [
              {"startTime" : "10:00:00",
              "endTime" : "11:00:00",
              "disabled" : false},
              {"startTime" : "11:00:00",
              "endTime" : "12:00:00",
              "disabled" : false},
              {"startTime" : "12:00:00",
              "endTime" : "13:00:00",
              "disabled" : false},
              {"startTime" : "14:00:00",
              "endTime" : "15:00:00",
              "disabled" : false},
              {"startTime" : "15:00:00",
              "endTime" : "16:00:00",
              "disabled" : false},
              {"startTime" : "16:00:00",
              "endTime" : "17:00:00",
              "disabled" : false},
            ]
      },
      getAvailableSlots(){
        if(this.doctorId === '' || this.appointmentDate === '')return
        this.axios.get("http://localhost:9090/rest/appointment/list",
        {
          params:{
            doctorId : this.doctorId,
            date : this.appointmentDate,
          }
        }
        ).then(res => this.disableBookedSlots(res.data))
      },
      disableBookedSlots(bookedSlots){
        this.setAppointmentTimes();
        for(let i = 0; i < bookedSlots.length; i++ ){
          for(let j = 0; j < this.appointmentTimes.length; j++){
            console.log(bookedSlots[i].startTime)
            console.log(this.appointmentTimes[j].startTime)
            if(this.appointmentTimes[j].startTime == bookedSlots[i].startTime){
              this.appointmentTimes[j].disabled = true;
            }
          }
        }
      },
      getPatientDetails(){
        this.axios.post("http://localhost:9090/rest/patient/list",
            { 
                id : this.patientId
            }
        ).then(res => {
          console.log(res);
          this.name = res.data[0].name;
          this.age = this.calculateAgeFromDob(res.data[0].dob);
        })
      },
      calculateAgeFromDob(dateString){
        var today = new Date();
        var birthDate = new Date(dateString);
        var age = today.getFullYear() - birthDate.getFullYear();
        var m = today.getMonth() - birthDate.getMonth();
        if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
            age--;
        }
        return age;
      }
    },  
}
</script>

<style>
label { 
    display: block; 
    width: 200px; 
    margin-top: 10px;
    margin-bottom: 5px;
}
button {
    margin-top: 20px;
    margin-left: 55px;
}
h1 {
  margin-left: 200px;
}
.page{
    margin-left:40%;
}
.form{
    margin-left:10px;
}
#appointment-time :enabled {
  background-color: #03fc03;
}
</style>