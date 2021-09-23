package com.example.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

internal fun Route.sampleRoute() {
    route("/sample") {
        get {
            call.respond(HttpStatusCode.OK, "hello sample!!")
        }
    }
}
