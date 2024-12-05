# PnrControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findReservationHistoryEvents**](PnrControllerApi.md#findReservationHistoryEvents) | **POST** /query-pnr-history |  |
| [**queryArchivedPnrList**](PnrControllerApi.md#queryArchivedPnrList) | **POST** /query-archived-pnr-list |  |
| [**queryPnr**](PnrControllerApi.md#queryPnr) | **POST** /query-pnr |  |
| [**queryPnrList**](PnrControllerApi.md#queryPnrList) | **POST** /query-pnr-list |  |
| [**queryPnrWithLock**](PnrControllerApi.md#queryPnrWithLock) | **POST** /query-pnr-with-lock |  |
| [**queryUnpaidPnrList**](PnrControllerApi.md#queryUnpaidPnrList) | **GET** /pnrs/unpaid |  |


<a name="findReservationHistoryEvents"></a>
# **findReservationHistoryEvents**
> com.ibm.tw.thsrc.aors.reservationquery.usecase.data.ReservationHistoryEventInfo findReservationHistoryEvents(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, com.ibm.tw.thsrc.aors.reservationquery.usecase.data.ReservationHistoryDataFilter.QueryReservationHistoryFilter, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **com.ibm.tw.thsrc.aors.reservationquery.usecase.data.ReservationHistoryDataFilter.QueryReservationHistoryFilter** | [**com.ibm.tw.thsrc.aors.reservationquery.usecase.data.ReservationHistoryDataFilter.QueryReservationHistoryFilter**](../tw.com.thsrc.resquery.model/com.ibm.tw.thsrc.aors.reservationquery.usecase.data.ReservationHistoryDataFilter.QueryReservationHistoryFilter.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**com.ibm.tw.thsrc.aors.reservationquery.usecase.data.ReservationHistoryEventInfo**](../tw.com.thsrc.resquery.model/com.ibm.tw.thsrc.aors.reservationquery.usecase.data.ReservationHistoryEventInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="queryArchivedPnrList"></a>
# **queryArchivedPnrList**
> org.springframework.data.domain.PageCom.ibm.tw.thsrc.aors.reservationquery.usecase.data.ArchivedPnrInfo queryArchivedPnrList(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, queryArchivedPnrList\_request, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **queryArchivedPnrList\_request** | [**queryArchivedPnrList_request**](../tw.com.thsrc.resquery.model/queryArchivedPnrList_request.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**org.springframework.data.domain.PageCom.ibm.tw.thsrc.aors.reservationquery.usecase.data.ArchivedPnrInfo**](../tw.com.thsrc.resquery.model/org.springframework.data.domain.PageCom.ibm.tw.thsrc.aors.reservationquery.usecase.data.ArchivedPnrInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="queryPnr"></a>
# **queryPnr**
> QueryPnrResponse queryPnr(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, QueryPnr, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **QueryPnr** | [**QueryPnr**](../tw.com.thsrc.resquery.model/QueryPnr.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**QueryPnrResponse**](../tw.com.thsrc.resquery.model/QueryPnrResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="queryPnrList"></a>
# **queryPnrList**
> QueryPnrListResponse queryPnrList(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, QueryPnrList, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **QueryPnrList** | [**QueryPnrList**](../tw.com.thsrc.resquery.model/QueryPnrList.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**QueryPnrListResponse**](../tw.com.thsrc.resquery.model/QueryPnrListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="queryPnrWithLock"></a>
# **queryPnrWithLock**
> QueryPnrResponse queryPnrWithLock(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, QueryPnr, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **QueryPnr** | [**QueryPnr**](../tw.com.thsrc.resquery.model/QueryPnr.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**QueryPnrResponse**](../tw.com.thsrc.resquery.model/QueryPnrResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="queryUnpaidPnrList"></a>
# **queryUnpaidPnrList**
> List queryUnpaidPnrList(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, param, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **param** | [**QueryUnpaidPnrList**](../tw.com.thsrc.resquery.model/.md)|  | [default to null] |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**List**](../tw.com.thsrc.resquery.model/com.ibm.tw.thsrc.aors.reservationquery.usecase.data.UnpaidPnrInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

