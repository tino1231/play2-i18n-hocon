# play2-i18n-hocon

[![test](https://github.com/tino1231/play2-i18n-hocon/workflows/test/badge.svg?branch=main)](https://github.com/tino1231/play2-i18n-hocon/actions/workflows/test.yml)
A Playframework module to use HOCON for i18n instead of properties

[HOCON](https://github.com/typesafehub/config/blob/v1.3.0/HOCON.md) (Human-Optimized Config Object Notation) and Typesafe Config are the standard way to [configure Play applications](https://www.playframework.com/documentation/2.8.x/Configuration). But, for Internationalization, Play uses [Java Properties](https://docs.oracle.com/javase/tutorial/essential/environment/properties.html) which don't have a syntax to structure an tree of keys used to i18n.

 This plugin offers that by using HOCON as the language for I18n too, so your `messages` files will be like:

```HOCON
 pages {
    signup {
        title = "The Signup page"
        form {
            title = "The signup form"
            name = "Type your name"
            email = "Type your email"
            password = "Type your password"
            submit = "Signup now"
        }
    }
 }
```

This is not meant to be used as a drop-in replacement to default built-in module since Java Properties syntax is not compatible with HOCON.

## How to use

Just follow the steps below:

### Add Module Dependency

Add the dependency to your `build.sbt` file:

```scala
externalResolvers += "hocon packages" at "https://maven.pkg.github.com/tino1231/play2-hocon-i18n"
libraryDependencies += "com.github.tino1231" %% "play2-hocon-i18n" % "1.0.0"
```

### Disable built-in I18n Module

Add the following line to your `conf/application.conf` file:

```
play.modules.disabled += play.api.i18n.I18nModule
```

### Enable HOCON I18n Module

Add the following line to your `conf/application.conf` file:

```
play.modules.enabled += com.tino1231.play.i18n.HoconI18nModule
```

### Write your message files with HOCON syntax

As stated before, HOCON syntax and Java Properties are not fully compatible. The good part is that HOCON loader gives clear messages about invalid syntax and you can easily fix the errors. Of course, all HOCON features are enable here. Finally, you have to rename your messages files to have a `.conf` extension, per instance:

| Before                | After                      |
|:----------------------|:---------------------------|
| `conf/messages`       | `conf/messages.conf`       |
| `conf/messages.ja`    | `conf/messages.ja.conf`    |
| `conf/messages.en-US` | `conf/messages.en-US.conf` |


## Fork of play-i18n-hocon

play2-i18n-hocon is a fork of [play-i18n-hocon](https://github.com/marcospereira/play-i18n-hocon).

[play-i18n-hocon](https://github.com/marcospereira/play-i18n-hocon) has been archived.

## License
play2-i18n-hocon is licensed under the Apache [License](https://github.com/tino1231/play2-i18n-hocon/blob/main/LICENSE), Version 2.0. See LICENSE for the full license text.

play2-i18n-hocon is a fork of play-i18n-hocon. play-i18n-hocon is licensed under the Apache License, Version 2.0.
