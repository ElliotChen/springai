# SeatOccupationControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**displaySeatOccupation**](SeatOccupationControllerApi.md#displaySeatOccupation) | **POST** /display-seat-occupation |  |


<a name="displaySeatOccupation"></a>
# **displaySeatOccupation**
> DisplaySeatOccupationResponse displaySeatOccupation(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, DisplaySeatOccupation, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **DisplaySeatOccupation** | [**DisplaySeatOccupation**](../tw.com.thsrc.resquery.model/DisplaySeatOccupation.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**DisplaySeatOccupationResponse**](../tw.com.thsrc.resquery.model/DisplaySeatOccupationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

