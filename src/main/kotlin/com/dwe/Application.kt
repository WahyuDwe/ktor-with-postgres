package com.dwe

import com.dwe.model.PostgresTaskRepository
import com.dwe.plugins.configureDatabases
import com.dwe.plugins.configureRouting
import com.dwe.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val repository = PostgresTaskRepository()

    configureSerialization(repository)
    configureDatabases()
    configureRouting()
}
