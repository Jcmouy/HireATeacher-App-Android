package com.hosseiniseyro.apprating.extensions

inline fun Int.applyIfNotZero(body: Int.() -> Any) {
    if (this != 0) {
        body()
    }
}