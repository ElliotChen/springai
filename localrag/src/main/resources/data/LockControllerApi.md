# LockControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**releaseAllLocks**](LockControllerApi.md#releaseAllLocks) | **POST** /release-all-locks |  |
| [**releaseLock**](LockControllerApi.md#releaseLock) | **POST** /release-lock |  |


<a name="releaseAllLocks"></a>
# **releaseAllLocks**
> releaseAllLocks(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseAllLocks, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseAllLocks** | [**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseAllLocks**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseAllLocks.md)|  | |
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

<a name="releaseLock"></a>
# **releaseLock**
> releaseLock(Content-Type, X-AORS-Channel-Id, X-AORS-Request-Id, com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseLockParameterObject, Equipment-Id, Shift-Sequence-Number, Employee-Id, Agent-Id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Content-Type** | **String**|  | [default to null] |
| **X-AORS-Channel-Id** | **String**|  | [default to null] |
| **X-AORS-Request-Id** | **String**|  | [default to null] |
| **com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseLockParameterObject** | [**com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseLockParameterObject**](../tw.com.thsrc.rescom.model/com.ibm.tw.thsrc.aors.reservationcommand.usecase.service.command.param.ReleaseLockParameterObject.md)|  | |
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

