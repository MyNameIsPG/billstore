import { request } from "./index"

/** Authraztion-小程序认证获取OpenId */
export const apiAuthraztioncodeGet = code => request("api/Authraztion/" + code, null, "GET")

/** Authraztion-获取开发测试Token */
export const apiAuthraztionDevTokenGet = data => request("api/Authraztion/DevToken", data, "GET")

/** CategoryReceipt-获取单个 */
export const apiCategoryReceiptidGet = id => request("api/CategoryReceipt/" + id, null, "GET")

/** CategoryReceipt-删除 */
export const apiCategoryReceiptidDelete = id => request("api/CategoryReceipt/" + id, null, "DELETE")

/** CategoryReceipt-分页查询 */
export const apiCategoryReceiptGet = data => request("api/CategoryReceipt", data, "GET")

/** CategoryReceipt-新增 */
export const apiCategoryReceiptPost = data => request("api/CategoryReceipt", data, "POST")

/** CategoryReceipt-修改 */
export const apiCategoryReceiptPut = data => request("api/CategoryReceipt", data, "PUT")

/** CustomerInfo-获取单个 */
export const apiCustomerInfoidGet = id => request("api/CustomerInfo/" + id, null, "GET")

/** CustomerInfo-删除 */
export const apiCustomerInfoidDelete = id => request("api/CustomerInfo/" + id, null, "DELETE")

/** CustomerInfo-分页查询 */
export const apiCustomerInfoGet = data => request("api/CustomerInfo", data, "GET")

/** CustomerInfo-新增 */
export const apiCustomerInfoPost = data => request("api/CustomerInfo", data, "POST")

/** CustomerInfo-修改 */
export const apiCustomerInfoPut = data => request("api/CustomerInfo", data, "PUT")

/** ExpenditureType-获取单个 */
export const apiExpenditureTypeidGet = id => request("api/ExpenditureType/" + id, null, "GET")

/** ExpenditureType-删除 */
export const apiExpenditureTypeidDelete = id => request("api/ExpenditureType/" + id, null, "DELETE")

/** ExpenditureType-分页查询 */
export const apiExpenditureTypeGet = data => request("api/ExpenditureType", data, "GET")

/** ExpenditureType-新增 */
export const apiExpenditureTypePost = data => request("api/ExpenditureType", data, "POST")

/** ExpenditureType-修改 */
export const apiExpenditureTypePut = data => request("api/ExpenditureType", data, "PUT")

/** Finance-获取单个 */
export const apiFinanceidGet = id => request("api/Finance/" + id, null, "GET")

/** Finance-删除 */
export const apiFinanceidDelete = id => request("api/Finance/" + id, null, "DELETE")

/** Finance-分页查询 */
export const apiFinanceGet = data => request("api/Finance", data, "GET")

/** Finance-新增 */
export const apiFinancePost = data => request("api/Finance", data, "POST")

/** Finance-修改 */
export const apiFinancePut = data => request("api/Finance", data, "PUT")

/** FinanceCustomerPayable-获取单个 */
export const apiFinanceCustomerPayableidGet = id => request("api/FinanceCustomerPayable/" + id, null, "GET")

/** FinanceCustomerPayable-删除 */
export const apiFinanceCustomerPayableidDelete = id => request("api/FinanceCustomerPayable/" + id, null, "DELETE")

/** FinanceCustomerPayable-分页查询 */
export const apiFinanceCustomerPayableGet = data => request("api/FinanceCustomerPayable", data, "GET")

/** FinanceCustomerPayable-新增 */
export const apiFinanceCustomerPayablePost = data => request("api/FinanceCustomerPayable", data, "POST")

/** FinanceCustomerPayable-修改 */
export const apiFinanceCustomerPayablePut = data => request("api/FinanceCustomerPayable", data, "PUT")

/** FinanceOtherPayable-获取单个 */
export const apiFinanceOtherPayableidGet = id => request("api/FinanceOtherPayable/" + id, null, "GET")

/** FinanceOtherPayable-删除 */
export const apiFinanceOtherPayableidDelete = id => request("api/FinanceOtherPayable/" + id, null, "DELETE")

/** FinanceOtherPayable-分页查询 */
export const apiFinanceOtherPayableGet = data => request("api/FinanceOtherPayable", data, "GET")

/** FinanceOtherPayable-新增 */
export const apiFinanceOtherPayablePost = data => request("api/FinanceOtherPayable", data, "POST")

/** FinanceOtherPayable-修改 */
export const apiFinanceOtherPayablePut = data => request("api/FinanceOtherPayable", data, "PUT")

/** FinanceOtherReceivable-获取单个 */
export const apiFinanceOtherReceivableidGet = id => request("api/FinanceOtherReceivable/" + id, null, "GET")

/** FinanceOtherReceivable-删除 */
export const apiFinanceOtherReceivableidDelete = id => request("api/FinanceOtherReceivable/" + id, null, "DELETE")

/** FinanceOtherReceivable-分页查询 */
export const apiFinanceOtherReceivableGet = data => request("api/FinanceOtherReceivable", data, "GET")

/** FinanceOtherReceivable-新增 */
export const apiFinanceOtherReceivablePost = data => request("api/FinanceOtherReceivable", data, "POST")

/** FinanceOtherReceivable-修改 */
export const apiFinanceOtherReceivablePut = data => request("api/FinanceOtherReceivable", data, "PUT")

/** FinanceOtherReceived-获取单个 */
export const apiFinanceOtherReceivedidGet = id => request("api/FinanceOtherReceived/" + id, null, "GET")

/** FinanceOtherReceived-删除 */
export const apiFinanceOtherReceivedidDelete = id => request("api/FinanceOtherReceived/" + id, null, "DELETE")

/** FinanceOtherReceived-分页查询 */
export const apiFinanceOtherReceivedGet = data => request("api/FinanceOtherReceived", data, "GET")

/** FinanceOtherReceived-新增 */
export const apiFinanceOtherReceivedPost = data => request("api/FinanceOtherReceived", data, "POST")

/** FinanceOtherReceived-修改 */
export const apiFinanceOtherReceivedPut = data => request("api/FinanceOtherReceived", data, "PUT")

/** FinanceSalesReceived-获取单个 */
export const apiFinanceSalesReceivedidGet = id => request("api/FinanceSalesReceived/" + id, null, "GET")

/** FinanceSalesReceived-删除 */
export const apiFinanceSalesReceivedidDelete = id => request("api/FinanceSalesReceived/" + id, null, "DELETE")

/** FinanceSalesReceived-分页查询 */
export const apiFinanceSalesReceivedGet = data => request("api/FinanceSalesReceived", data, "GET")

/** FinanceSalesReceived-新增 */
export const apiFinanceSalesReceivedPost = data => request("api/FinanceSalesReceived", data, "POST")

/** FinanceSalesReceived-修改 */
export const apiFinanceSalesReceivedPut = data => request("api/FinanceSalesReceived", data, "PUT")

/** FinanceSupplierReceivable-获取单个 */
export const apiFinanceSupplierReceivableidGet = id => request("api/FinanceSupplierReceivable/" + id, null, "GET")

/** FinanceSupplierReceivable-删除 */
export const apiFinanceSupplierReceivableidDelete = id => request("api/FinanceSupplierReceivable/" + id, null, "DELETE")

/** FinanceSupplierReceivable-分页查询 */
export const apiFinanceSupplierReceivableGet = data => request("api/FinanceSupplierReceivable", data, "GET")

/** FinanceSupplierReceivable-新增 */
export const apiFinanceSupplierReceivablePost = data => request("api/FinanceSupplierReceivable", data, "POST")

/** FinanceSupplierReceivable-修改 */
export const apiFinanceSupplierReceivablePut = data => request("api/FinanceSupplierReceivable", data, "PUT")

/** FinanceSupplierReceived-获取单个 */
export const apiFinanceSupplierReceivedidGet = id => request("api/FinanceSupplierReceived/" + id, null, "GET")

/** FinanceSupplierReceived-删除 */
export const apiFinanceSupplierReceivedidDelete = id => request("api/FinanceSupplierReceived/" + id, null, "DELETE")

/** FinanceSupplierReceived-分页查询 */
export const apiFinanceSupplierReceivedGet = data => request("api/FinanceSupplierReceived", data, "GET")

/** FinanceSupplierReceived-新增 */
export const apiFinanceSupplierReceivedPost = data => request("api/FinanceSupplierReceived", data, "POST")

/** FinanceSupplierReceived-修改 */
export const apiFinanceSupplierReceivedPut = data => request("api/FinanceSupplierReceived", data, "PUT")

/** Goods-获取单个 */
export const apiGoodsidGet = id => request("api/Goods/" + id, null, "GET")

/** Goods-删除 */
export const apiGoodsidDelete = id => request("api/Goods/" + id, null, "DELETE")

/** Goods-分页查询 */
export const apiGoodsGet = data => request("api/Goods", data, "GET")

/** Goods-新增 */
export const apiGoodsPost = data => request("api/Goods", data, "POST")

/** Goods-修改 */
export const apiGoodsPut = data => request("api/Goods", data, "PUT")

/** GoodsInPrice-获取单个 */
export const apiGoodsInPriceidGet = id => request("api/GoodsInPrice/" + id, null, "GET")

/** GoodsInPrice-删除 */
export const apiGoodsInPriceidDelete = id => request("api/GoodsInPrice/" + id, null, "DELETE")

/** GoodsInPrice-分页查询 */
export const apiGoodsInPriceGet = data => request("api/GoodsInPrice", data, "GET")

/** GoodsInPrice-新增 */
export const apiGoodsInPricePost = data => request("api/GoodsInPrice", data, "POST")

/** GoodsInPrice-修改 */
export const apiGoodsInPricePut = data => request("api/GoodsInPrice", data, "PUT")

/** GoodsReturnPrice-获取单个 */
export const apiGoodsReturnPriceidGet = id => request("api/GoodsReturnPrice/" + id, null, "GET")

/** GoodsReturnPrice-删除 */
export const apiGoodsReturnPriceidDelete = id => request("api/GoodsReturnPrice/" + id, null, "DELETE")

/** GoodsReturnPrice-分页查询 */
export const apiGoodsReturnPriceGet = data => request("api/GoodsReturnPrice", data, "GET")

/** GoodsReturnPrice-新增 */
export const apiGoodsReturnPricePost = data => request("api/GoodsReturnPrice", data, "POST")

/** GoodsReturnPrice-修改 */
export const apiGoodsReturnPricePut = data => request("api/GoodsReturnPrice", data, "PUT")

/** GoodsSalePrice-获取单个 */
export const apiGoodsSalePriceidGet = id => request("api/GoodsSalePrice/" + id, null, "GET")

/** GoodsSalePrice-删除 */
export const apiGoodsSalePriceidDelete = id => request("api/GoodsSalePrice/" + id, null, "DELETE")

/** GoodsSalePrice-分页查询 */
export const apiGoodsSalePriceGet = data => request("api/GoodsSalePrice", data, "GET")

/** GoodsSalePrice-新增 */
export const apiGoodsSalePricePost = data => request("api/GoodsSalePrice", data, "POST")

/** GoodsSalePrice-修改 */
export const apiGoodsSalePricePut = data => request("api/GoodsSalePrice", data, "PUT")

/** GoodsSpe-获取单个 */
export const apiGoodsSpeidGet = id => request("api/GoodsSpe/" + id, null, "GET")

/** GoodsSpe-删除 */
export const apiGoodsSpeidDelete = id => request("api/GoodsSpe/" + id, null, "DELETE")

/** GoodsSpe-分页查询 */
export const apiGoodsSpeGet = data => request("api/GoodsSpe", data, "GET")

/** GoodsSpe-新增 */
export const apiGoodsSpePost = data => request("api/GoodsSpe", data, "POST")

/** GoodsSpe-修改 */
export const apiGoodsSpePut = data => request("api/GoodsSpe", data, "PUT")

/** PayType-获取单个 */
export const apiPayTypeidGet = id => request("api/PayType/" + id, null, "GET")

/** PayType-删除 */
export const apiPayTypeidDelete = id => request("api/PayType/" + id, null, "DELETE")

/** PayType-分页查询 */
export const apiPayTypeGet = data => request("api/PayType", data, "GET")

/** PayType-新增 */
export const apiPayTypePost = data => request("api/PayType", data, "POST")

/** PayType-修改 */
export const apiPayTypePut = data => request("api/PayType", data, "PUT")

/** Role-获取单个 */
export const apiRoleidGet = id => request("api/Role/" + id, null, "GET")

/** Role-删除 */
export const apiRoleidDelete = id => request("api/Role/" + id, null, "DELETE")

/** Role-分页查询 */
export const apiRoleGet = data => request("api/Role", data, "GET")

/** Role-新增 */
export const apiRolePost = data => request("api/Role", data, "POST")

/** Role-修改 */
export const apiRolePut = data => request("api/Role", data, "PUT")

/** StoreExpenses-获取单个 */
export const apiStoreExpensesidGet = id => request("api/StoreExpenses/" + id, null, "GET")

/** StoreExpenses-删除 */
export const apiStoreExpensesidDelete = id => request("api/StoreExpenses/" + id, null, "DELETE")

/** StoreExpenses-分页查询 */
export const apiStoreExpensesGet = data => request("api/StoreExpenses", data, "GET")

/** StoreExpenses-新增 */
export const apiStoreExpensesPost = data => request("api/StoreExpenses", data, "POST")

/** StoreExpenses-修改 */
export const apiStoreExpensesPut = data => request("api/StoreExpenses", data, "PUT")

/** StoreOrder-获取单个 */
export const apiStoreOrderidGet = id => request("api/StoreOrder/" + id, null, "GET")

/** StoreOrder-删除 */
export const apiStoreOrderidDelete = id => request("api/StoreOrder/" + id, null, "DELETE")

/** StoreOrder-分页查询 */
export const apiStoreOrderGet = data => request("api/StoreOrder", data, "GET")

/** StoreOrder-新增 */
export const apiStoreOrderPost = data => request("api/StoreOrder", data, "POST")

/** StoreOrder-修改 */
export const apiStoreOrderPut = data => request("api/StoreOrder", data, "PUT")

/** StorePurchaseOrder-获取单个 */
export const apiStorePurchaseOrderidGet = id => request("api/StorePurchaseOrder/" + id, null, "GET")

/** StorePurchaseOrder-删除 */
export const apiStorePurchaseOrderidDelete = id => request("api/StorePurchaseOrder/" + id, null, "DELETE")

/** StorePurchaseOrder-分页查询 */
export const apiStorePurchaseOrderGet = data => request("api/StorePurchaseOrder", data, "GET")

/** StorePurchaseOrder-新增 */
export const apiStorePurchaseOrderPost = data => request("api/StorePurchaseOrder", data, "POST")

/** StorePurchaseOrder-修改 */
export const apiStorePurchaseOrderPut = data => request("api/StorePurchaseOrder", data, "PUT")

/** StoreReturnDetial-获取单个 */
export const apiStoreReturnDetialidGet = id => request("api/StoreReturnDetial/" + id, null, "GET")

/** StoreReturnDetial-删除 */
export const apiStoreReturnDetialidDelete = id => request("api/StoreReturnDetial/" + id, null, "DELETE")

/** StoreReturnDetial-分页查询 */
export const apiStoreReturnDetialGet = data => request("api/StoreReturnDetial", data, "GET")

/** StoreReturnDetial-新增 */
export const apiStoreReturnDetialPost = data => request("api/StoreReturnDetial", data, "POST")

/** StoreReturnDetial-修改 */
export const apiStoreReturnDetialPut = data => request("api/StoreReturnDetial", data, "PUT")

/** StoreSaleOrder-获取单个 */
export const apiStoreSaleOrderidGet = id => request("api/StoreSaleOrder/" + id, null, "GET")

/** StoreSaleOrder-删除 */
export const apiStoreSaleOrderidDelete = id => request("api/StoreSaleOrder/" + id, null, "DELETE")

/** StoreSaleOrder-分页查询 */
export const apiStoreSaleOrderGet = data => request("api/StoreSaleOrder", data, "GET")

/** StoreSaleOrder-新增 */
export const apiStoreSaleOrderPost = data => request("api/StoreSaleOrder", data, "POST")

/** StoreSaleOrder-修改 */
export const apiStoreSaleOrderPut = data => request("api/StoreSaleOrder", data, "PUT")

/** StoreSaleOrderDetial-获取单个 */
export const apiStoreSaleOrderDetialidGet = id => request("api/StoreSaleOrderDetial/" + id, null, "GET")

/** StoreSaleOrderDetial-删除 */
export const apiStoreSaleOrderDetialidDelete = id => request("api/StoreSaleOrderDetial/" + id, null, "DELETE")

/** StoreSaleOrderDetial-分页查询 */
export const apiStoreSaleOrderDetialGet = data => request("api/StoreSaleOrderDetial", data, "GET")

/** StoreSaleOrderDetial-新增 */
export const apiStoreSaleOrderDetialPost = data => request("api/StoreSaleOrderDetial", data, "POST")

/** StoreSaleOrderDetial-修改 */
export const apiStoreSaleOrderDetialPut = data => request("api/StoreSaleOrderDetial", data, "PUT")

/** StoreWaresSorting-获取单个 */
export const apiStoreWaresSortingidGet = id => request("api/StoreWaresSorting/" + id, null, "GET")

/** StoreWaresSorting-删除 */
export const apiStoreWaresSortingidDelete = id => request("api/StoreWaresSorting/" + id, null, "DELETE")

/** StoreWaresSorting-分页查询 */
export const apiStoreWaresSortingGet = data => request("api/StoreWaresSorting", data, "GET")

/** StoreWaresSorting-新增 */
export const apiStoreWaresSortingPost = data => request("api/StoreWaresSorting", data, "POST")

/** StoreWaresSorting-修改 */
export const apiStoreWaresSortingPut = data => request("api/StoreWaresSorting", data, "PUT")

/** StoreWaste-获取单个 */
export const apiStoreWasteidGet = id => request("api/StoreWaste/" + id, null, "GET")

/** StoreWaste-删除 */
export const apiStoreWasteidDelete = id => request("api/StoreWaste/" + id, null, "DELETE")

/** StoreWaste-分页查询 */
export const apiStoreWasteGet = data => request("api/StoreWaste", data, "GET")

/** StoreWaste-新增 */
export const apiStoreWastePost = data => request("api/StoreWaste", data, "POST")

/** StoreWaste-修改 */
export const apiStoreWastePut = data => request("api/StoreWaste", data, "PUT")

/** SupplierInfo-获取单个 */
export const apiSupplierInfoidGet = id => request("api/SupplierInfo/" + id, null, "GET")

/** SupplierInfo-删除 */
export const apiSupplierInfoidDelete = id => request("api/SupplierInfo/" + id, null, "DELETE")

/** SupplierInfo-分页查询 */
export const apiSupplierInfoGet = data => request("api/SupplierInfo", data, "GET")

/** SupplierInfo-新增 */
export const apiSupplierInfoPost = data => request("api/SupplierInfo", data, "POST")

/** SupplierInfo-修改 */
export const apiSupplierInfoPut = data => request("api/SupplierInfo", data, "PUT")

/** User-获取单个 */
export const apiUseridGet = id => request("api/User/" + id, null, "GET")

/** User-删除 */
export const apiUseridDelete = id => request("api/User/" + id, null, "DELETE")

/** User-分页查询 */
export const apiUserGet = data => request("api/User", data, "GET")

/** User-新增 */
export const apiUserPost = data => request("api/User", data, "POST")

/** User-修改 */
export const apiUserPut = data => request("api/User", data, "PUT")

/** UserRole-获取单个 */
export const apiUserRoleidGet = id => request("api/UserRole/" + id, null, "GET")

/** UserRole-删除 */
export const apiUserRoleidDelete = id => request("api/UserRole/" + id, null, "DELETE")

/** UserRole-分页查询 */
export const apiUserRoleGet = data => request("api/UserRole", data, "GET")

/** UserRole-新增 */
export const apiUserRolePost = data => request("api/UserRole", data, "POST")

/** UserRole-修改 */
export const apiUserRolePut = data => request("api/UserRole", data, "PUT")

/** Warehouse-获取单个 */
export const apiWarehouseidGet = id => request("api/Warehouse/" + id, null, "GET")

/** Warehouse-删除 */
export const apiWarehouseidDelete = id => request("api/Warehouse/" + id, null, "DELETE")

/** Warehouse-分页查询 */
export const apiWarehouseGet = data => request("api/Warehouse", data, "GET")

/** Warehouse-新增 */
export const apiWarehousePost = data => request("api/Warehouse", data, "POST")

/** Warehouse-修改 */
export const apiWarehousePut = data => request("api/Warehouse", data, "PUT")

/** WarehouseEx-获取单个 */
export const apiWarehouseExidGet = id => request("api/WarehouseEx/" + id, null, "GET")

/** WarehouseEx-删除 */
export const apiWarehouseExidDelete = id => request("api/WarehouseEx/" + id, null, "DELETE")

/** WarehouseEx-分页查询 */
export const apiWarehouseExGet = data => request("api/WarehouseEx", data, "GET")

/** WarehouseEx-新增 */
export const apiWarehouseExPost = data => request("api/WarehouseEx", data, "POST")

/** WarehouseEx-修改 */
export const apiWarehouseExPut = data => request("api/WarehouseEx", data, "PUT")

/** Warehousing-获取单个 */
export const apiWarehousingidGet = id => request("api/Warehousing/" + id, null, "GET")

/** Warehousing-删除 */
export const apiWarehousingidDelete = id => request("api/Warehousing/" + id, null, "DELETE")

/** Warehousing-分页查询 */
export const apiWarehousingGet = data => request("api/Warehousing", data, "GET")

/** Warehousing-新增 */
export const apiWarehousingPost = data => request("api/Warehousing", data, "POST")

/** Warehousing-修改 */
export const apiWarehousingPut = data => request("api/Warehousing", data, "PUT")

/** WaresGrowth-获取单个 */
export const apiWaresGrowthidGet = id => request("api/WaresGrowth/" + id, null, "GET")

/** WaresGrowth-删除 */
export const apiWaresGrowthidDelete = id => request("api/WaresGrowth/" + id, null, "DELETE")

/** WaresGrowth-分页查询 */
export const apiWaresGrowthGet = data => request("api/WaresGrowth", data, "GET")

/** WaresGrowth-新增 */
export const apiWaresGrowthPost = data => request("api/WaresGrowth", data, "POST")

/** WaresGrowth-修改 */
export const apiWaresGrowthPut = data => request("api/WaresGrowth", data, "PUT")

/** WaresReturnd-获取单个 */
export const apiWaresReturndidGet = id => request("api/WaresReturnd/" + id, null, "GET")

/** WaresReturnd-删除 */
export const apiWaresReturndidDelete = id => request("api/WaresReturnd/" + id, null, "DELETE")

/** WaresReturnd-分页查询 */
export const apiWaresReturndGet = data => request("api/WaresReturnd", data, "GET")

/** WaresReturnd-新增 */
export const apiWaresReturndPost = data => request("api/WaresReturnd", data, "POST")

/** WaresReturnd-修改 */
export const apiWaresReturndPut = data => request("api/WaresReturnd", data, "PUT")

/** WaresSortingDetial-获取单个 */
export const apiWaresSortingDetialidGet = id => request("api/WaresSortingDetial/" + id, null, "GET")

/** WaresSortingDetial-删除 */
export const apiWaresSortingDetialidDelete = id => request("api/WaresSortingDetial/" + id, null, "DELETE")

/** WaresSortingDetial-分页查询 */
export const apiWaresSortingDetialGet = data => request("api/WaresSortingDetial", data, "GET")

/** WaresSortingDetial-新增 */
export const apiWaresSortingDetialPost = data => request("api/WaresSortingDetial", data, "POST")

/** WaresSortingDetial-修改 */
export const apiWaresSortingDetialPut = data => request("api/WaresSortingDetial", data, "PUT")

/** WaresWastage-获取单个 */
export const apiWaresWastageidGet = id => request("api/WaresWastage/" + id, null, "GET")

/** WaresWastage-删除 */
export const apiWaresWastageidDelete = id => request("api/WaresWastage/" + id, null, "DELETE")

/** WaresWastage-分页查询 */
export const apiWaresWastageGet = data => request("api/WaresWastage", data, "GET")

/** WaresWastage-新增 */
export const apiWaresWastagePost = data => request("api/WaresWastage", data, "POST")

/** WaresWastage-修改 */
export const apiWaresWastagePut = data => request("api/WaresWastage", data, "PUT")
