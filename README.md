# Vox Styleguide

A [re-frame](https://github.com/Day8/re-frame) application based on clojurescript

## What is ClojureScript? ##

[ClojureScript](http://clojurescript.org) is a compiler for [Clojure](http://clojure.org) that targets JavaScript. It is designed to emit JavaScript code which is compatible with the advanced compilation mode of the [Google Closure](https://developers.google.com/closure/compiler/) optimizing compiler.

Official web site: http://clojurescript.org

## Requirements: ##

Install [Leiningen](http://leiningen.org/).

**Note:** You can also install leiningen via homebrew with `brew install leiningen`

Install [Node](https://nodejs.org/en/)

**Note:** Node comes with NPM, use it to install dependencies  `npm install` on the project root

Run `gulp` to compile assets

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
