const BASE_URL = "https://106.13.3.19/";
// const BASE_URL = "http://192.168.199.163:8010/";

export const request = (url, data = {}, method = "GET") => {
	console.log(uni.getStorageSync('token'))
	return new Promise((resolve, reject) => {
		uni.request({
			url: BASE_URL + url,
			method: method,
			data: data || {},
			header: {
				authorization: 'Bearer ' + uni.getStorageSync('token')
			},
			success: (res) => {
				if (res.statusCode === 401) {
					uni.navigateTo({
						url: `/pages/authenticate/authenticate`
					});
				}
				if (res.statusCode !== 200) {
					return uni.showToast({
						icon: "none",
						title: "获取数据失败"
					})
				}
				if (res.data.errCode != 0) {
					if (res.data.errMsg) {
						return uni.showToast({
							icon: "none",
							title: res.data.errMsg
						})
					} else {
						return uni.showToast({
							icon: "none",
							title: "接口请求失败"
						})
					}
				}
				if (res.data.count > 0) {
					if (res.data.data.length > 0) {
						res.data.data.forEach(item => item.isShow = false)
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
