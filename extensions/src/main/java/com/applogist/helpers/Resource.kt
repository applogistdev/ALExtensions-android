package com.applogist.helpers

/**
 * A generic class that holds a value with its loading status.
 * @param <T>
</T> */
sealed class Resource<out T> {
    class Success<T>(val data: T) : Resource<T>()
    class Error(val msg: String) : Resource<Nothing>()
    object Loading : Resource<Nothing>()
}