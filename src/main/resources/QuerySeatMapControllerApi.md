# QuerySeatMapControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**querySeatMap**](QuerySeatMapControllerApi.md#querySeatMap) | **POST** /seat-maps |  |


<a name="querySeatMap"></a>
# **querySeatMap**
> QuerySeatMapResponse querySeatMap(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, SeatMapFilter)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **SeatMapFilter** | [**SeatMapFilter**](../tw.com.thsrc.trip.model/SeatMapFilter.md)|  | |

### Return type

[**QuerySeatMapResponse**](../tw.com.thsrc.trip.model/QuerySeatMapResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

