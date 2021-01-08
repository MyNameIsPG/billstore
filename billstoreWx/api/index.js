const BASE_URL = "http://172.18.1.76:8097/";

export const request = (url, data={}, method="GET") => {
	return new Promise((resolve, reject) => {
		uni.request({
			url: BASE_URL + url,
			method: method,
			data: data || {},
			success: (res) => {
				if (res.statusCode !== 200) {
					return uni.showToast({
						icon: "none",
						title: "获取数据失败"
					})
				}
				if(res.data.ErrCode!=0){
					if(res.data.ErrMsg){
						return uni.showToast({
							icon: "none",
							title: res.data.ErrMsg
						})
					} else {
						return uni.showToast({
							icon: "none",
							title: "接口请求失败"
						})
					}
				}
				resolve(res.data)
			},
			fail: (err) => {
				uni.showToast({
					icon: "none",
					title: "接口请求失败"
				})
				reject(err)
			}
		})
	})
}

export const apiRequest = (options) => {
	return new Promise((resolve, reject) => {
		uni.request({
			url: BASE_URL + options.url,
			method: options.methods || "GET",
			data: options.data || {},
			success: (res) => {
				if (res.statusCode !== 200) {
					return uni.showToast({
						title: "获取数据失败"
					})
				}
				resolve(res.data)
			},
			fail: (err) => {
				uni.showToast({
					title: "接口请求失败"
				})
				reject(err)
			}
		})
	})
}


