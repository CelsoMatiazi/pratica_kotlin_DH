package funcoes

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


fun main() {
    timer()
}

var seconds = 0
var minutes = 0
var hour = 0


fun timer(){

    Executors.newSingleThreadScheduledExecutor().schedule({
       if(seconds < 60){
           seconds += 1
       }

        if(seconds == 60){
            minutes += 1
            seconds = 0
        }

        if(minutes ==  60){
            hour += 1
            minutes = 0
        }

        if(hour == 13){
            hour = 0
        }

        if(hour.toString().length == 1){
            hour
        }

        print("${if (hour.toString().length == 1 )"0$hour" else "$hour"}:")
        print("${if (minutes.toString().length == 1 )"0$minutes" else "$minutes"}:")
        println("${if (seconds.toString().length == 1 )"0$seconds" else "$seconds"}")

        timer()

    },1, TimeUnit.SECONDS)
}


