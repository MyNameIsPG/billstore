import { request } from "./index"

/** 客户表-删除 */
export const apiCustomerDelete = data => request("/api/customer/delete", data, "DELETE")

/** 客户表-查询全部 */
export const apiCustomerQueryAll = data => request("/api/customer/queryAll", data, "GET")

/** 客户表-查询单条记录 */
export const apiCustomerQueryOne = data => request("/api/customer/queryOne", data, "GET")

/** 客户表-分页查询 */
export const apiCustomerQueryPage = data => request("/api/customer/queryPage", data, "POST")

/** 客户表-新增 */
export const apiCustomerSave = data => request("/api/customer/save", data, "POST")

/** 客户表-修改 */
export const apiCustomerUpdate = data => request("/api/customer/update", data, "PUT")

/** 商品表-删除 */
export const apiGoodsDelete = data => request("/api/goods/delete", data, "DELETE")

/** 商品表-查询全部 */
export const apiGoodsQueryAll = data => request("/api/goods/queryAll", data, "GET")

/** 商品表-查询单条记录 */
export const apiGoodsQueryOne = data => request("/api/goods/queryOne", data, "GET")

/** 商品表-分页查询 */
export const apiGoodsQueryPage = data => request("/api/goods/queryPage", data, "POST")

/** 商品表-新增 */
export const apiGoodsSave = data => request("/api/goods/save", data, "POST")

/** 商品表-修改 */
export const apiGoodsUpdate = data => request("/api/goods/update", data, "PUT")

/** 商品价格表-删除 */
export const apiGoodspriceDelete = data => request("/api/goodsprice/delete", data, "DELETE")

/** 商品价格表-查询全部 */
export const apiGoodspriceQueryAll = data => request("/api/goodsprice/queryAll", data, "GET")

/** 商品价格表-查询单条记录 */
export const apiGoodspriceQueryOne = data => request("/api/goodsprice/queryOne", data, "GET")

/** 商品价格表-分页查询 */
export const apiGoodspriceQueryPage = data => request("/api/goodsprice/queryPage", data, "POST")

/** 商品价格表-新增 */
export const apiGoodspriceSave = data => request("/api/goodsprice/save", data, "POST")

/** 商品价格表-修改 */
export const apiGoodspriceUpdate = data => request("/api/goodsprice/update", data, "PUT")

/** 支出类别表-删除 */
export const apiPytypeDelete = data => request("/api/pytype/delete", data, "DELETE")

/** 支出类别表-查询全部 */
export const apiPytypeQueryAll = data => request("/api/pytype/queryAll", data, "GET")

/** 支出类别表-查询单条记录 */
export const apiPytypeQueryOne = data => request("/api/pytype/queryOne", data, "GET")

/** 支出类别表-分页查询 */
export const apiPytypeQueryPage = data => request("/api/pytype/queryPage", data, "POST")

/** 支出类别表-新增 */
export const apiPytypeSave = data => request("/api/pytype/save", data, "POST")

/** 支出类别表-修改 */
export const apiPytypeUpdate = data => request("/api/pytype/update", data, "PUT")

/** 付款方式表-删除 */
export const apiPywayDelete = data => request("/api/pyway/delete", data, "DELETE")

/** 付款方式表-查询全部 */
export const apiPywayQueryAll = data => request("/api/pyway/queryAll", data, "GET")

/** 付款方式表-查询单条记录 */
export const apiPywayQueryOne = data => request("/api/pyway/queryOne", data, "GET")

/** 付款方式表-分页查询 */
export const apiPywayQueryPage = data => request("/api/pyway/queryPage", data, "POST")

/** 付款方式表-新增 */
export const apiPywaySave = data => request("/api/pyway/save", data, "POST")

/** 付款方式表-修改 */
export const apiPywayUpdate = data => request("/api/pyway/update", data, "PUT")

/** 供应商表-删除 */
export const apiSuppliersDelete = data => request("/api/suppliers/delete", data, "DELETE")

/** 供应商表-查询全部 */
export const apiSuppliersQueryAll = data => request("/api/suppliers/queryAll", data, "GET")

/** 供应商表-查询单条记录 */
export const apiSuppliersQueryOne = data => request("/api/suppliers/queryOne", data, "GET")

/** 供应商表-分页查询 */
export const apiSuppliersQueryPage = data => request("/api/suppliers/queryPage", data, "POST")

/** 供应商表-新增 */
export const apiSuppliersSave = data => request("/api/suppliers/save", data, "POST")

/** 供应商表-修改 */
export const apiSuppliersUpdate = data => request("/api/suppliers/update", data, "PUT")

/** 人员表-删除 */
export const apiUserDelete = data => request("/api/user/delete", data, "DELETE")

/** 人员表-查询全部 */
export const apiUserQueryAll = data => request("/api/user/queryAll", data, "GET")

/** 人员表-查询单条记录 */
export const apiUserQueryOne = data => request("/api/user/queryOne", data, "GET")

/** 人员表-分页查询 */
export const apiUserQueryPage = data => request("/api/user/queryPage", data, "POST")

/** 人员表-新增 */
export const apiUserSave = data => request("/api/user/save", data, "POST")

/** 人员表-修改 */
export const apiUserUpdate = data => request("/api/user/update", data, "PUT")

/** 微信登录-微信第一次登录后认证 */
export const apiWxAuthenticate = data => request("/api/wx/authenticate", data, "GET")

/** 微信登录-微信登录并查看权限 */
export const apiWxLogin = data => request("/api/wx/login", data, "GET")
