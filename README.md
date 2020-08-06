# Kotlin Sandbox

I'll try various Kotlin syntax

## Description
### Scope Function
- `apply`
- `let`
- `run`
- `also`

#### apply
**Apply** refers to the context object as a lambda receiver – by keyword `this`, which you can omit the kyeword.
This feature makes it ideal for changing value of object fields.

```kotlin
val child = Child("Rei", lastName = "Ayanami", id = 1)
            .apply {
                age = 14
                gender = Gender.FEMALE
            }
```

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
