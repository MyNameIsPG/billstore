import Vue from 'vue'
import App from './App'

import uView from 'uview-ui'
import cuCustom from './colorui/components/cu-custom.vue'
import ANodata from './components/a-nodata/a-nodata.vue'
import AAddbtn from './components/a-addbtn/a-addbtn.vue'
import AFormAdd from './components/a-form-add/a-form-add.vue'
Vue.use(uView)
Vue.component('cu-custom', cuCustom)
Vue.component('a-nodata', ANodata)
Vue.component('a-addbtn', AAddbtn)
Vue.component('a-form-add', AFormAdd)

import {
	apiRequest
} from './api/index.js'
import * as request from './api/api.js'

Vue.prototype.$request = apiRequest
Vue.prototype.request = request
Vue.prototype.IS_OK = 200
Vue.prototype.pageSize = 20
Vue.config.productionTip = false
Vue.prototype.swipe_action_options = [{
		text: '修改',
		style: {
			backgroundColor: '#1F6ED4'
		}
	},
	{
		text: '删除',
		style: {
			backgroundColor: '#FF2E63'
		}
	}
]

App.mpType = 'app'

const app = new Vue({
	...App
})
app.$mount()
