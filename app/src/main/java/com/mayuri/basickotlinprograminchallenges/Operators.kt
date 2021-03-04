package com.mayuri.basickotlinprograminchallenges

import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableOnSubscribe
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.internal.operators.observable.ObservableError
import java.lang.Exception
import java.util.*
import java.util.concurrent.TimeUnit

val mList  = mutableListOf(1,2,3,4,5,6,7,8,9)

val arrayNum = arrayOf(1,2,3,4,5,6,7,8,9,10,11)
val arrayNum1 = arrayOf(11,22,33,44,55,66,77,88,99)

val mUserList = mutableListOf<User>(
    User(1, "demo1", 15),
    User(2, "demo2", 18),
    User(3, "demo3", 20),
    User(4, "demo4", 21),
    User(5, "demo5", 23),
    User(6, "demo6", 22),
    User(7, "demo7", 22),
    User(8, "demo8", 17),
    User(9, "demo9", 17),
    User(9, "demo9", 17)
)

fun justOpertor (){
    val observable = Observable.just(mList);

    val observer = object : Observer<List<Int>> {
        override fun onComplete() {
            Log.d(MainActivity.TAG,  "In Complete");
        }

        override fun onSubscribe(d: Disposable?) {
            Log.d(MainActivity.TAG,  "In Subscribe");
        }

        override fun onNext(t: List<Int>?) {
            Log.d(MainActivity.TAG,  "In OnNext : $t");
        }

        override fun onError(e: Throwable?) {
            Log.d(MainActivity.TAG,  "In Error");
        }
    }

    observable.subscribe(observer);
}

fun fromArrayOperator (){
    val observable = Observable.fromArray(arrayNum, arrayNum1)

    val observer = object : Observer<Array<Int>>{
        override fun onComplete() {
            Log.d(MainActivity.TAG,  "In Complete")
        }

        override fun onSubscribe(d: Disposable?) {
            Log.d(MainActivity.TAG,  "In Subscribe")
        }

        override fun onNext(t: Array<Int>?) {
            Log.d(MainActivity.TAG,  "In OnNext : ${Arrays.toString(t)}")
        }

        override fun onError(e: Throwable?) {
            Log.d(MainActivity.TAG,  "In Error")
        }
    }

    observable.subscribe(observer)
}

fun fromIterableOperator(){
    val observable = Observable.fromIterable(mList)

    val observer = object : Observer<Int> {
        override fun onComplete() {
            Log.d(MainActivity.TAG,  "In Complete");
        }

        override fun onSubscribe(d: Disposable?) {
            Log.d(MainActivity.TAG,  "In Subscribe");
        }

        override fun onNext(t: Int ?) {
            Log.d(MainActivity.TAG,  "In OnNext : $t");
        }

        override fun onError(e: Throwable?) {
            Log.d(MainActivity.TAG,  "In Error");
        }
    }
    observable.subscribe(observer)
}

fun rangeOperator(): Observable<Int>{

    return Observable.range(6, 10)
}

fun repeatOperator(): Observable<Int>{

    return Observable.range(6, 10).repeat(2);
}

fun intervalOperator(): Observable<Long>{

    return Observable.interval(1, TimeUnit.SECONDS).takeWhile({value ->value<=10})
}

fun timerOperator(): Observable<Long>{

    return Observable.timer(5, TimeUnit.SECONDS)
}

fun createOperator(): Observable<Int>{

    return Observable.create(ObservableOnSubscribe<Int> {
        try{
            for(i in mList){
                it.onNext(i*5)
            }

            it.onComplete()
        } catch ( e: Exception){
            it.onError(e)
        }
    })
}

fun filterOperator(): Observable<User>{
    return  Observable.fromIterable(mUserList)
}

fun lastOperator(): Observable<User>{
    return Observable.fromIterable(mUserList)
}

fun distinctOperator(): Observable<User>{
    return Observable.fromIterable(mUserList)
}

fun sikpOperator(): Observable<User>{
    return Observable.fromIterable(mUserList)
}

fun bufferOperator(): Observable<User>{
    return Observable.fromIterable(mUserList)
}

fun mapOperator(): Observable<User>{
    return Observable.fromIterable(mUserList)
}

