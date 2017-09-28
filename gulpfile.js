const gulp = require('gulp');
const gulpLoadPlugins = require('gulp-load-plugins');
const concat = require('gulp-concat');
const del = require('del');

const $ = gulpLoadPlugins();

gulp.task('styles', () => {
  return gulp.src('resources/sass/*.scss')
    .pipe($.plumber())
    .pipe($.sass.sync({
      outputStyle: 'expanded',
      precision: 10,
      includePaths: ['.']
    }).on('error', $.sass.logError))
    .pipe($.cssnano({safe: true, autoprefixer: false}))
    .pipe($.autoprefixer())
    .pipe(gulp.dest('resources/public/css'));
});

gulp.task('clean', del.bind(null, ['resources/public/css']));

gulp.task('default', ['clean'], () => {
  gulp.start('styles');
});