import { request } from "./index"

/** 获取微信的OpendId并查询用户表是否存在(若存在则返回该实体;若不存在则新增后返回该实体) */
export const apiUserGetWXOpenid = data => request("api/User/GetWXOpenid", data, "GET")



/** 用户分页查询 */
export const apiUserDataPageList = data => request("api/User/DataPageList", data, "GET")
/** 用户新增 */
export const apiUserAdd = data => request("api/User", data, "POST")
/** 用户修改 */
export const apiUserUpdate = data => request("api/User", data, "PUT")
/** 用户单个查询 */
export const apiUserInfo = UserId => request("api/User/" + UserId, null, "GET")
/** 用户删除 */
export const apiUserDelete = UserId => request("api/User/" + UserId, null, "DELETE")



/** 商品分页查询 */
export const apiGoodsDataPageList = data => request("api/Goods/DataPageList", data, "GET")
/** 商品新增 */
export const apiGoodsAdd = data => request("api/Goods", data, "POST")
/** 商品修改 */
export const apiGoodsUpdate = data => request("api/Goods", data, "PUT")
/** 商品单个查询 */
export const apiGoodsInfo = GoodsId => request("api/Goods/" + GoodsId, null, "GET")
/** 商品删除 */
export const apiGoodsDelete = GoodsId => request("api/Goods/" + GoodsId, null, "DELETE")



/** 商品规格分页查询 */
export const apiGoodsSpecsDataPageList = data => request("api/GoodsSpecs/DataPageList", data, "GET")
/** 商品规格新增 */
export const apiGoodsSpecsAdd = data => request("api/GoodsSpecs", data, "POST")
/** 商品规格修改 */
export const apiGoodsSpecsUpdate = data => request("api/GoodsSpecs", data, "PUT")
/** 商品规格单个查询 */
export const apiGoodsSpecsInfo = GoodsSpecsId => request("api/GoodsSpecs/" + GoodsSpecsId, null, "GET")
/** 商品规格删除 */
export const apiGoodsSpecsDelete = GoodsSpecsId => request("api/GoodsSpecs/" + GoodsSpecsId, null, "DELETE")



/** 商品分页查询 */
/** 商品新增 */
/** 商品修改 */
/** 商品单个查询 */
/** 商品删除 */