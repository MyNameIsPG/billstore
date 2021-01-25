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



/** 支付方式分页查询 */
export const apiPayTypeDataPageList = data => request("api/PayType/DataPageList", data, "GET")
/** 支付方式新增 */
export const apiPayTypeAdd = data => request("api/PayType", data, "POST")
/** 支付方式修改 */
export const apiPayTypeUpdate = data => request("api/PayType", data, "PUT")
/** 支付方式单个查询 */
export const apiPayTypeInfo = PayTypeId => request("api/PayType/" + PayTypeId , null, "GET")
/** 支付方式删除 */
export const apiPayTypeDelete = PayTypeId => request("api/PayType/" + PayTypeId , null, "DELETE")



/** 支出类别分页查询 */
export const apiExpenditureCategoryDataPageList = data => request("api/ExpenditureCategory/DataPageList", data, "GET")
/** 支出类别新增 */
export const apiExpenditureCategoryAdd = data => request("api/ExpenditureCategory", data, "POST")
/** 支出类别修改 */
export const apiExpenditureCategoryUpdate = data => request("api/ExpenditureCategory", data, "PUT")
/** 支出类别单个查询 */
export const apiExpenditureCategoryInfo = ExpenditureCategoryId => request("api/ExpenditureCategory/" + ExpenditureCategoryId , null, "GET")
/** 支出类别删除 */
export const apiExpenditureCategoryDelete = ExpenditureCategoryId => request("api/ExpenditureCategory/" + ExpenditureCategoryId , null, "DELETE")



/** 到账类别分页查询 */
export const apiCategoryReceiptDataPageList = data => request("api/CategoryReceipt/DataPageList", data, "GET")
/** 到账类别新增 */
export const apiCategoryReceiptAdd = data => request("api/CategoryReceipt", data, "POST")
/** 到账类别修改 */
export const apiCategoryReceiptUpdate = data => request("api/CategoryReceipt", data, "PUT")
/** 到账类别单个查询 */
export const apiCategoryReceiptInfo = CategoryReceiptId => request("api/CategoryReceipt/" + CategoryReceiptId , null, "GET")
/** 到账类别删除 */
export const apiCategoryReceiptDelete = CategoryReceiptId => request("api/CategoryReceipt/" + CategoryReceiptId , null, "DELETE")



/** 进价分页查询 */
export const apiPurchasePriceDataPageList = data => request("api/PurchasePrice/DataPageList", data, "GET")
/** 进价新增 */
export const apiPurchasePriceAdd = data => request("api/PurchasePrice", data, "POST")
/** 进价单个查询 */
export const apiPurchasePriceInfo = PurchasePriceId => request("api/PurchasePrice/" + PurchasePriceId , null, "GET")



/** 售价分页查询 */
export const apiSellPriceDataPageList = data => request("api/SellPrice/DataPageList", data, "GET")
/** 售价新增 */
export const apiSellPriceAdd = data => request("api/SellPrice", data, "POST")
/** 售价单个查询 */
export const apiSellPriceInfo = SellPriceId => request("api/SellPrice/" + SellPriceId , null, "GET")



/** 退货分页查询 */
export const apiReturnPriceDataPageList = data => request("api/ReturnPrice/DataPageList", data, "GET")
/** 退货新增 */
export const apiReturnPriceAdd = data => request("api/ReturnPrice", data, "POST")
/** 退货单个查询 */
export const apiReturnPriceInfo = ReturnPriceId => request("api/ReturnPrice/" + ReturnPriceId , null, "GET")



/** 商品分页查询 */
/** 商品新增 */
/** 商品修改 */
/** 商品单个查询 */
/** 商品删除 */