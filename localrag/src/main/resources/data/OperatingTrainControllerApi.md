# OperatingTrainControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**displaySeatAvailability**](OperatingTrainControllerApi.md#displaySeatAvailability) | **GET** /train-config-template |  |
| [**querySchedules**](OperatingTrainControllerApi.md#querySchedules) | **POST** /train-schedules |  |
| [**queryTrainStatistics**](OperatingTrainControllerApi.md#queryTrainStatistics) | **GET** /train-statistics |  |


<a name="displaySeatAvailability"></a>
# **displaySeatAvailability**
> DisplaySeatAvailabilityResponse displaySeatAvailability(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, trainDate, trainNum)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **trainDate** | **String**|  | [default to null] |
| **trainNum** | **String**|  | [default to null] |

### Return type

[**DisplaySeatAvailabilityResponse**](../tw.com.thsrc.trip.model/DisplaySeatAvailabilityResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

<a name="querySchedules"></a>
# **querySchedules**
> QueryTrainScheduleDto querySchedules(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, TrainScheduleFilter)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **TrainScheduleFilter** | [**TrainScheduleFilter**](../tw.com.thsrc.trip.model/TrainScheduleFilter.md)|  | |

### Return type

[**QueryTrainScheduleDto**](../tw.com.thsrc.trip.model/QueryTrainScheduleDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="queryTrainStatistics"></a>
# **queryTrainStatistics**
> SeatAvailabilityResponse queryTrainStatistics(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, trainDate, trainNumber)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **trainDate** | **String**|  | [default to null] |
| **trainNumber** | **String**|  | [default to null] |

### Return type

[**SeatAvailabilityResponse**](../tw.com.thsrc.trip.model/SeatAvailabilityResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

