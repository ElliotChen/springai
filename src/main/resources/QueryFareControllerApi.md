# QueryFareControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryFare**](QueryFareControllerApi.md#queryFare) | **POST** /query-fare |  |


<a name="queryFare"></a>
# **queryFare**
> QueriedFare queryFare(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, QueryFare)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **QueryFare** | [**QueryFare**](../tw.com.thsrc.trip.model/QueryFare.md)|  | |

### Return type

[**QueriedFare**](../tw.com.thsrc.trip.model/QueriedFare.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

