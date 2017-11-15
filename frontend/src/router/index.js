import Vue from 'vue'
import Router from 'vue-router'
import nbNO from 'vee-validate/dist/locale/nb_NO'
import VeeValidate, {Validator} from 'vee-validate'
import Home from '@/components/Home'
import Persons from '@/components/Persons'
import Callback from '@/components/Callback'

Vue.use(Router)
Vue.use(VeeValidate)

Validator.localize('nb_NO', nbNO)

const router = new Router({
    mode: 'history',
    routes: [
        {
            path: '/home',
            name: 'Home',
            component: Home
        },
        {
            path: '/persons',
            name: 'Persons',
            component: Persons
        },
        {
            path: '/callback',
            name: 'Callback',
            component: Callback
        },
        {
            path: '*',
            redirect: '/home'
        }
    ]
})

export default router
