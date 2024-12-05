# TicketingControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryRefunds**](TicketingControllerApi.md#queryRefunds) | **POST** /query-refunds |  |
| [**querySpecialConditionRefunds**](TicketingControllerApi.md#querySpecialConditionRefunds) | **POST** /query-special-condition-refunds |  |
| [**queryTicketEndorsements**](TicketingControllerApi.md#queryTicketEndorsements) | **GET** /ticket-endorsements |  |
| [**queryTicketRefunds**](TicketingControllerApi.md#queryTicketRefunds) | **POST** /query-ticket-refunds |  |
| [**queryTicketStatus**](TicketingControllerApi.md#queryTicketStatus) | **GET** /query-ticket-status |  |


<a name="queryRefunds"></a>
# **queryRefunds**
> QueryRefundResponse queryRefunds(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, QueryRefund, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **QueryRefund** | [**QueryRefund**](../tw.com.thsrc.ticquery.model/QueryRefund.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**QueryRefundResponse**](../tw.com.thsrc.ticquery.model/QueryRefundResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="querySpecialConditionRefunds"></a>
# **querySpecialConditionRefunds**
> QuerySpecialConditionRefundResponse querySpecialConditionRefunds(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, QuerySpecialConditionRefund, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **QuerySpecialConditionRefund** | [**QuerySpecialConditionRefund**](../tw.com.thsrc.ticquery.model/QuerySpecialConditionRefund.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**QuerySpecialConditionRefundResponse**](../tw.com.thsrc.ticquery.model/QuerySpecialConditionRefundResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="queryTicketEndorsements"></a>
# **queryTicketEndorsements**
> Set queryTicketEndorsements(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, dateTime)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **dateTime** | **Date**|  | [optional] [default to null] |

### Return type

[**Set**](../tw.com.thsrc.ticquery.model/TicketEndorsement.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

<a name="queryTicketRefunds"></a>
# **queryTicketRefunds**
> QueryRefundResponse queryTicketRefunds(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, QueryTicketRefund, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **QueryTicketRefund** | [**QueryTicketRefund**](../tw.com.thsrc.ticquery.model/QueryTicketRefund.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**QueryRefundResponse**](../tw.com.thsrc.ticquery.model/QueryRefundResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="queryTicketStatus"></a>
# **queryTicketStatus**
> QueryTicketStatusResponse queryTicketStatus(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id, pnrcode, ticketNumber)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |
| **pnrcode** | **String**|  | [optional] [default to null] |
| **ticketNumber** | **String**|  | [optional] [default to null] |

### Return type

[**QueryTicketStatusResponse**](../tw.com.thsrc.ticquery.model/QueryTicketStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

