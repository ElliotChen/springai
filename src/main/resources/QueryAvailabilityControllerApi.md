# QueryAvailabilityControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryAvailability**](QueryAvailabilityControllerApi.md#queryAvailability) | **POST** /availability |  |


<a name="queryAvailability"></a>
# **queryAvailability**
> List queryAvailability(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, AvailabilityFilter)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **AvailabilityFilter** | [**AvailabilityFilter**](../tw.com.thsrc.trip.model/AvailabilityFilter.md)|  | |

### Return type

[**List**](../tw.com.thsrc.trip.model/QueryAvailabilityDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

