/*----------------------------------------------------------------------------*/
/* Source File:   APPLICATION.KT                                              */
/* Copyright (c), 2023 TheMuskeeters                                          */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Apr.22/2023  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.themusketeers.world.region.services

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Entry point for running the application.
 */
@SpringBootApplication
class Application

/**
 * Running application definition entry point.
 *
 * @param args Includes the command line parameters for the application.
 */
fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
