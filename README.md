Shopping Cart - BDD example of Scala
====================================

Application built with the following (main) technologies:

- Scala 2.11.2

- SBT 0.13.5

- Specs2 2.4.2

Introduction
------------

Satisfy the given requirements:

Step 1: Shopping cart
- You are building a checkout system for a shop which only sells apples and oranges.  
- Apples cost 60p and oranges cost 25p.
- Build a checkout system which takes a list of items scanned at the till and outputs the total cost
- For example: [ Apple, Apple, Orange, Apple ] => £2.05
- Make reasonable assumptions about the inputs to your solution; for example, many candidates take a list of strings as input
 
Step 2: Simple offers
- The shop decides to introduce two new offers:
 - buy one, get one free on Apples
 - 3 for the price of 2 on Oranges

Setup
-----


Go into the application's new project directory (with the "cd" shown) and complete the following:
> $ cd shopping-cart

> $ activator

> [shopping-cart] $ update-classifiers

> [shopping-cart] $ gen-idea sbt-classifiers

> [shopping-cart] $ test

Hopefully all (unit) "specs" will pass and you can now open up IntelliJ and start going through "The Code" as explained below.
