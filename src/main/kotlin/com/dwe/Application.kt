package com.dwe

import com.dwe.model.FakeTaskRepository
import com.dwe.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val repository = FakeTaskRepository()

    configureDatabases()
    configureRouting()
    configureSerialization(repository)
}
