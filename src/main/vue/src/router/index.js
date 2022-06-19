import { createWebHistory, createRouter } from "vue-router";

import HomePage from "../components/HomePage.vue";

//Top navbar
import LoginPage from "../components/LoginPage.vue"
import AboutUs from "../components/AboutUs.vue"
import DevContact from "../components/DevContact.vue"

//Register
import RegisterPage from "../components/RegisterPage.vue"
import AdminRegister from "../components/AdminRegister.vue"
import DoctorRegister from "../components/DoctorRegister.vue"
import ReceptionistRegister from "../components/ReceptionistRegister.vue"
import PatientRegister from "../components/PatientRegister.vue"
import AppointmentRegister from "../components/AppointmentRegister.vue"

//Login
import AdminLogin from "../components/AdminLogin.vue"
import DoctorLogin from "../components/DoctorLogin.vue"
import ReceptionistLogin from "../components/ReceptionistLogin.vue"

const routes=[
    {
        name: 'HomePage',
        path: '/',
        component: HomePage
    },
    {
        name: 'AdminRegister',
        path: '/admin-register',
        component: AdminRegister
    },
    {
        name: 'DoctorRegister',
        path: '/register/doctor',
        component: DoctorRegister
    },
    {
        name: 'ReceptionistRegister',
        path: '/register/receptionist',
        component: ReceptionistRegister
    },
    {
        name: 'PatientRegister',
        path: '/register/patient',
        component: PatientRegister
    },
    {
        name: 'AppointmentRegister',
        path: '/register/appointment',
        component: AppointmentRegister
    },
    {
        name: 'LoginPage',
        path: '/login',
        component: LoginPage
    },
    {
        name: 'AdminLogin',
        path: '/login/admin',
        component: AdminLogin
    },
    {
        name: 'DoctorLogin',
        path: '/login/doctor',
        component: DoctorLogin
    },
    {
        name: 'ReceptionistLogin',
        path: '/login/receptionist',
        component: ReceptionistLogin
    },
    {
        name: 'AboutUs',
        path: '/about',
        component: AboutUs
    },
    {
        name: 'DevContact',
        path: '/dev-contact',
        component: DevContact
    },
    {
        name: 'RegisterPage',
        path: '/register',
        component: RegisterPage
    },

]

const router = createRouter({
    history:createWebHistory(),
    routes
});

export default router;