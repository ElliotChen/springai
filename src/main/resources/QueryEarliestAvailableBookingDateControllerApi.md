# QueryEarliestAvailableBookingDateControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryEarliestAvailableBookingDate**](QueryEarliestAvailableBookingDateControllerApi.md#queryEarliestAvailableBookingDate) | **POST** /earliest-available-booking-dates |  |


<a name="queryEarliestAvailableBookingDate"></a>
# **queryEarliestAvailableBookingDate**
> EarliestAvailableBookingDateResponse queryEarliestAvailableBookingDate(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, EarliestAvailableBookingDateFilter)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **EarliestAvailableBookingDateFilter** | [**EarliestAvailableBookingDateFilter**](../tw.com.thsrc.trip.model/EarliestAvailableBookingDateFilter.md)|  | |

### Return type

[**EarliestAvailableBookingDateResponse**](../tw.com.thsrc.trip.model/EarliestAvailableBookingDateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

