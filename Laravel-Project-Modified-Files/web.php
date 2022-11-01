<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('/hello', function() {

    return response()->json([
        'title' => 'My first blog post',
        'description' => 'I just LOVE PHP. NOOOT.'
    ]);
});

Route::get('/goodbye', function() {

    return response('Hello World!')
    ->header('Content-Type', 'text-plain');
});

Route::get('posts/{id}', function($id) {
    ddd($id);
    return response('Post', 'id');
})->where('id', '[0-9]+');

Route::get('/', function() {
    return view('listings', [
        'heading'=> 'Latest listings',
        'listings' => 
        [

        
            [
                'id' => 0,
                'title' => 'My First Title',
                'description' => 'Is it home time yet?'   
            ],
            [
                'id' => 1,
                'title' => 'My Other Title',
                'description' => 'Happy Halloween!'    
            ]
        ]

    ]);
});
