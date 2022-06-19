<template>
  <div>
      <div class="search-container">
        <div>
            <label for="appointment-id">Appointment ID:</label>
            <input type="text" v-model="appointmentId" id="appointment-id" />
          </div>
          <div>
            <label for="doctor">Doctor:</label>
            <select name="Select Doctor" id="doctors" v-model="doctorId">
              <option value=""  selected>Select doctor</option>
              <option v-for="doctor in doctors" :key="doctor.id" :value="doctor.id">Dr. {{doctor.name}} ({{doctor.specialisation}})</option>
            </select>
          </div>
          <div>
            <label for="patient-name">Patient Name:</label>
            <input type="text" v-model="patientName" id="patient-name"  />
          </div>
          <div>
            <label for="appointment-date">Appointment Date:</label>
            <input type="date" v-model="appointmentDate" @input="getAvailableSlots" id="appointment-date" min="2020-01-01" max="2030-12-31"/>
          </div>
          <button @click="getAppointmentList"> Filter </button>
          <button @click="resetSearchParams"> Reset </button>
      </div>
      <table>
        <thead>
          <tr>
            <th v-for="column in columns" :key="column.value">{{column.text}}</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="appointment in appointmentList" :key="appointment.id">
            <td v-for="column in columns" :key="column.value">{{appointment[column.value]}}</td>
          </tr>
        </tbody>
      </table>
  </div>
</template>

<script>
export default {
    name: 'AppointmentSearch',
    data() {
        return {
            patientName : '',
            doctorId : '',
            appointmentId : '',
            appointmentDate : null,
            doctors : [],
            columns : [
              {text: "Appointment No.", value: "id"},
              {text: "Patient Name", value: "patientName"},
              {text: "Patient Age", value: "patientAge"}, 
              {text: "Patient Blood Group", value: "patientBloodGroup"},
              {text: "Patient Contact No.", value: "patientMobile"},
              {text: "Appointed Doctor", value: "appointedDoctor"},
              {text: "Appointment Register Date", value: "crtDtm"},
              {text:"Appointment Date", value: "date"},
              {text:"Appointment Time", value: "time"},
            ],
            appointmentList : []

        }
    },
    mounted() {
      this.getDoctors();
      this.getAppointmentList();
    },
    methods: {
      getAppointmentList(){
        this.axios.get("http://localhost:9090/rest/appointment/list",
        {
          params:{
            patientName : this.patientName,
            doctorId : this.doctorId,
            appointmentId : this.appointmentId,
            date : this.appointmentDate,
          }
        }
        ).then(res => this.formatTableData(res.data))
      },
      formatTableData(data){
        this.appointmentList = data;
        for(let i = 0; i < this.appointmentList.length; i++){
          this.appointmentList[i].patientAge = this.calculateAgeFromDob(this.appointmentList[i].patientDob)
          this.appointmentList[i].time = this.appointmentList[i].startTime.substring(0,5) + " - " + this.appointmentList[i].endTime.substring(0,5)
          this.appointmentList[i].appointedDoctor = this.appointmentList[i].doctorName + " (" + this.appointmentList[i].doctorSpecialisation + ")"
        }
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
      },
      getDoctors(){
        this.axios.get("http://localhost:9090/rest/doctor/list"
        ).then(res => {
          this.doctors = res.data;
        })
      },
      resetSearchParams(){
        this.patientName = '';
        this.doctorId = '';
        this.appointmentId = '';
        this.appointmentDate = null;
        this.getAppointmentList();
      }
    }
}
</script>

<style>
button {
  margin-left: 10px;
  margin-top: 30px;
  height: 25px;
  vertical-align: center;
}
tr { 
  border-bottom: 1pt ridge burlywood; 
  }
th {
  padding: 6px;
  background-color: burlywood;
}
td {
  text-align: center;
  background-color: lightyellow;
}
table { 
    border-collapse: collapse; 
    margin-top: 20px;
    margin-left: 20px;
    margin-right: 20px;
    border : solid 1px black;
}
.table_legenda {
  table-layout: fixed;
}
.table_legenda th {
  overflow-wrap: break-word;
}
.search-container {
  display: flex;
  margin-left: 20px;
}
</style>