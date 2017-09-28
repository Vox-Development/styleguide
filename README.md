# Vox Syleguide

A [re-frame](https://github.com/Day8/re-frame) application based on clojure


### Clojure

Install [Leiningen](http://leiningen.org/). To begin working on this project

**Note:** You can also install leiningen via homebrew with `brew install leiningen`

## What is ClojureScript? ##

[ClojureScript](http://clojurescript.org) is a compiler for [Clojure](http://clojure.org) that targets JavaScript. It is designed to emit JavaScript code which is compatible with the advanced compilation mode of the [Google Closure](https://developers.google.com/closure/compiler/) optimizing compiler.

Official web site: http://clojurescript.org

## Development Mode

### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

## Production Build


To compile clojurescript to javascript:

```
lein clean
lein cljsbuild once min
```
