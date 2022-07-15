package com.technowave.demoapp.utils

sealed class DataResources<T>() {
    data class Loading<T>(val isLoading: Boolean) : DataResources<T>()
    data class Success<T>(val data: T? = null, val message: String? = null) : DataResources<T>()
    data class Error<T>(val error: Throwable) : DataResources<T>()
}
