# DraftControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**draftAssignmentsAddition**](DraftControllerApi.md#draftAssignmentsAddition) | **POST** /draft-assignments-addition |  |
| [**draftAssignmentsModification**](DraftControllerApi.md#draftAssignmentsModification) | **POST** /draft-assignments-modification |  |
| [**draftSeatsAssignment**](DraftControllerApi.md#draftSeatsAssignment) | **POST** /draft-seats-assignment |  |
| [**draftSeatsModification**](DraftControllerApi.md#draftSeatsModification) | **POST** /draft-seats-modification |  |
| [**draftSegmentsModification**](DraftControllerApi.md#draftSegmentsModification) | **POST** /draft-segments-modification |  |
| [**releaseReservedSeats**](DraftControllerApi.md#releaseReservedSeats) | **POST** /release-reserved-seats |  |


<a name="draftAssignmentsAddition"></a>
# **draftAssignmentsAddition**
> com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsAdditionResponse draftAssignmentsAddition(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsAddition, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsAddition** | [**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsAddition**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsAddition.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsAdditionResponse**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsAdditionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="draftAssignmentsModification"></a>
# **draftAssignmentsModification**
> com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftModificationResponse draftAssignmentsModification(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsModification, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsModification** | [**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsModification**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftAssignmentsModification.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftModificationResponse**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftModificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="draftSeatsAssignment"></a>
# **draftSeatsAssignment**
> com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsAssignmentResponse draftSeatsAssignment(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsAssignment, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsAssignment** | [**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsAssignment**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsAssignment.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsAssignmentResponse**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsAssignmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="draftSeatsModification"></a>
# **draftSeatsModification**
> com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsModificationResponse draftSeatsModification(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsModification, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsModification** | [**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsModification**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsModification.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsModificationResponse**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSeatsModificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="draftSegmentsModification"></a>
# **draftSegmentsModification**
> com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftModificationResponse draftSegmentsModification(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSegmentsModification, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSegmentsModification** | [**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSegmentsModification**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftSegmentsModification.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

[**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftModificationResponse**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.DraftModificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="releaseReservedSeats"></a>
# **releaseReservedSeats**
> releaseReservedSeats(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseReservedSeatsParameterObject, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseReservedSeatsParameterObject** | [**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseReservedSeatsParameterObject**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseReservedSeatsParameterObject.md)|  | |
| **Equipment-Id** | **String**|  | [optional] [default to null] |
| **Shift-Sequence-Number** | **String**|  | [optional] [default to null] |
| **Employee-Id** | **String**|  | [optional] [default to null] |
| **Agent-Id** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

