# PromotionFareControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validatedSmallGroup**](PromotionFareControllerApi.md#validatedSmallGroup) | **POST** /promotion-fares/small-group/validate |  |


<a name="validatedSmallGroup"></a>
# **validatedSmallGroup**
> ValidatedSmallGroupDto validatedSmallGroup(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, ValidateSmallGroupParam)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **ValidateSmallGroupParam** | [**ValidateSmallGroupParam**](../tw.com.thsrc.trip.model/ValidateSmallGroupParam.md)|  | |

### Return type

[**ValidatedSmallGroupDto**](../tw.com.thsrc.trip.model/ValidatedSmallGroupDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

