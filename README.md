# MicroOffice Word Processing Application GUI Testing

## Overview

MicroOffice, a software company, has developed four generations of Word Processing Applications: Word90, Word00, Word10, and Word24. Your task is to write a program to test their GUIs, focusing on the components - Panel, Button, and Textbox. These components vary across different generations, and each generation has its own testing program.

## Requirements

To run the tests, you'll need to instantiate objects corresponding to each GUI component for the specified Word generations. The information about the generations to be tested is stored in a configuration file (text file). A single test run involves finishing the execution of all generations specified in the configuration file.

To organize the creation of objects based on GUI components and handle the instantiation of generations, the program leverages the Abstract Factory pattern. Additionally, the Singleton pattern is incorporated to ensure that at most two instances of each generation are created in each test run.

## Example Configuration File

Word90
Word00
Word90
Word24
Word10
Word00
Word24
Word90
Word00




## Class Diagram

