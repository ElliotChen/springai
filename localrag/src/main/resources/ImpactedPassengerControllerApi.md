# ImpactedPassengerControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllImpactedPassengers**](ImpactedPassengerControllerApi.md#getAllImpactedPassengers) | **GET** /impacted-passengers |  |


<a name="getAllImpactedPassengers"></a>
# **getAllImpactedPassengers**
> Set getAllImpactedPassengers(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, impactedPassengerFilter, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **impactedPassengerFilter** | [**com.ibm.tw.thsrc.aors.reservationquery.usecase.data.ImpactedPassengerDataFilter.ImpactedPassengerFilter**](../tw.com.thsrc.resquery.model/.md)|  | [default to null] |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**Set**](../tw.com.thsrc.resquery.model/com.ibm.tw.thsrc.aors.reservationquery.usecase.data.ImpactedPassengerInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

