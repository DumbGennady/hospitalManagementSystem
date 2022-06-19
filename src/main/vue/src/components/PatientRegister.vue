<template>
  <div class="page">
      <h1> Register Patient </h1>
      <div class="form">
          <div>
            <label for="name">Name:</label>
            <input type="text" v-model="name" id="name" placeholder="Enter full name"/>
          </div>
          <div>
            <label for="email">E-Mail:</label>
            <input type="text" v-model="email" id="email" placeholder="Enter email id"/>
          </div>
          <div>
            <label for="phone">Phone No:</label>
            <input type="text" v-model="phone" id="phone" placeholder="Enter phone no"/>
          </div>
          <div>
            <label for="dob">Date Of Birth:</label>
            <input type="date" v-model="dob" id="dob" min="1997-01-01" max="2030-12-31"/>
          </div>
          <div>
            <label for="blood-group">Blood Group:</label>
            <input type="text" v-model="bloodGroup" id="blood-group" placeholder="Enter blood group"/>
          </div>
          <div>
            <label for="address">Address:</label>
            <input type="text" v-model="address" id="address" placeholder="Enter complete address"/>
          </div>
          <div>
            <label for="city">City:</label>
            <input type="text" v-model="city" id="city" placeholder="Enter city"/>
          </div>
      </div>
      <button @click="registerPatient"> Register </button>
  </div>
</template>

<script>
export default {
    name: 'PatientRegister',
    data() {
        return {
            name: '',
            email: '',
            phone: '',
            dob: '',
            bloodGroup: '',
            address: '',
            city: ''
        }
    },
    methods: {
        validateInput(){
           
            return true;
        },
        registerPatient(){
            if(this.validateInput()){
                this.axios.post("http://localhost:9090/rest/patient/insert",
                {
                    "name": this.name,
                    "email": this.email,
                    "mobile": this.phone,
                    "dob": this.dob,
                    "bloodGroup": this.bloodGroup,
                    "address": this.address,
                    "city": this.city
                }
                ).then((res) => {
                    // if(res.data !== 1)this.$notify("Item cannot be added")
                    if(res.data === 1)alert("Patient successfully registered");
                    console.log(res);
                }
            )}
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
.page{
    margin-left:40%;
}
.form{
    margin-left:10px;
}
</style>