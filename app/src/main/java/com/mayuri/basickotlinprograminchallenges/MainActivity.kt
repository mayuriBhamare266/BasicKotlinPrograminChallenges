package com.mayuri.basickotlinprograminchallenges

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    companion object{
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  justOpertor()
       // fromArrayOperator()
      //  fromIterableOperator()

      /*  rangeOperator().subscribe(
            {
                Log.d(MainActivity.TAG,  "In OnNext : $it");
            }, {
                Log.d(MainActivity.TAG,  "In OnError : ${it}");
            }, {
                Log.d(MainActivity.TAG,  "In Complete");
            })
*/
/*
        repeatOperator().subscribe(
            {
                Log.d(MainActivity.TAG,  "In OnNext : $it");
            }, {
                Log.d(MainActivity.TAG,  "In OnError : ${it}");
            }, {
                Log.d(MainActivity.TAG,  "In Complete");
            })
*/
     /*   intervalOperator().subscribe(
            {
                Log.d(MainActivity.TAG,  "In OnNext : $it");
            }, {
                Log.d(MainActivity.TAG,  "In OnError : ${it}");
            }, {
                Log.d(MainActivity.TAG,  "In Complete");
            })
*/

        /*timerOperator().subscribe(
            {
                Log.d(MainActivity.TAG,  "In OnNext : $it");
            }, {
                Log.d(MainActivity.TAG,  "In OnError : ${it}");
            }, {
                Log.d(MainActivity.TAG,  "In Complete");
            })*/

     /*   createOperator().subscribe(
            {
                Log.d(MainActivity.TAG,  "In OnNext : $it");
            }, {
                Log.d(MainActivity.TAG,  "In OnError : ${it}");
            }, {
                Log.d(MainActivity.TAG,  "In Complete");
            })
*/
        /*filterOperator()
            .filter { it.age>18 }
            .subscribe(
                {
                    Log.d(MainActivity.TAG,  "In OnNext : $it");
                }, {
                    Log.d(MainActivity.TAG,  "In OnError : ${it}");
                }, {
                    Log.d(MainActivity.TAG, "In Complete");
                }
        )*/
/*
        lastOperator()
            //.last(User(1, "demo1", 15))
            .lastElement()
            .subscribe(
                {
                    Log.d(MainActivity.TAG,  "In OnNext : $it");
                }, {
                    Log.d(MainActivity.TAG,  "In OnError : ${it}");
                }
            )*/
/*
        distinctOperator()
            //.distinct{ it.age }
            .distinct()
            .subscribe(
                {
                    Log.d(MainActivity.TAG,  "In OnNext : $it");
                }, {
                    Log.d(MainActivity.TAG,  "In OnError : ${it}");
                }, {
                    Log.d(MainActivity.TAG, "In Complete");
                }
            )*/


        /*sikpOperator()
            .distinct()
            //.skip(2)
            //.skipLast(3)
            .skip(2, TimeUnit.MILLISECONDS)
            .subscribe(
                {
                    Log.d(MainActivity.TAG,  "In OnNext : $it");
                }, {
                    Log.d(MainActivity.TAG,  "In OnError : ${it}");
                }, {
                    Log.d(MainActivity.TAG, "In Complete");
                }
            )*/
/*
        bufferOperator()
            .buffer(4)
            .subscribe(
                {
                    Log.d(MainActivity.TAG,  "In OnNext : $it");
                }, {
                    Log.d(MainActivity.TAG,  "In OnError : ${it}");
                }, {
                    Log.d(MainActivity.TAG, "In Complete")
                }
            )*/

        mapOperator()
            .map {
                UserProfile(it.id, it.name, it.age, "abc${it.id}")
            }
            .subscribe(
                {
                    Log.d(MainActivity.TAG,  "In OnNext : $it")
                }, {
                    Log.d(MainActivity.TAG,  "In OnError : ${it}")
                }, {
                    Log.d(MainActivity.TAG, "In Complete")
                }
            )
    }
}