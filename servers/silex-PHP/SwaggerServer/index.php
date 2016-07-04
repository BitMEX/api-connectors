<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();

    
        
            

$app->GET('/order', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing order.getOrders as a GET method ?');
            });

            

$app->PUT('/order', function(Application $app, Request $request) {
            
            $order_id = $request->get('order_id');    $cl_ord_id = $request->get('cl_ord_id');    $simple_order_qty = $request->get('simple_order_qty');    $order_qty = $request->get('order_qty');    $simple_leaves_qty = $request->get('simple_leaves_qty');    $leaves_qty = $request->get('leaves_qty');    $price = $request->get('price');    $stop_px = $request->get('stop_px');    $peg_offset_value = $request->get('peg_offset_value');    $text = $request->get('text');    
            return new Response('How about implementing order.amend as a PUT method ?');
            });

            

$app->POST('/order', function(Application $app, Request $request) {
            
            $symbol = $request->get('symbol');    $side = $request->get('side');    $simple_order_qty = $request->get('simple_order_qty');    $quantity = $request->get('quantity');    $order_qty = $request->get('order_qty');    $price = $request->get('price');    $display_qty = $request->get('display_qty');    $stop_price = $request->get('stop_price');    $stop_px = $request->get('stop_px');    $cl_ord_id = $request->get('cl_ord_id');    $cl_ord_link_id = $request->get('cl_ord_link_id');    $peg_offset_value = $request->get('peg_offset_value');    $peg_price_type = $request->get('peg_price_type');    $type = $request->get('type');    $ord_type = $request->get('ord_type');    $time_in_force = $request->get('time_in_force');    $exec_inst = $request->get('exec_inst');    $contingency_type = $request->get('contingency_type');    $text = $request->get('text');    
            return new Response('How about implementing order.new as a POST method ?');
            });

            

$app->DELETE('/order', function(Application $app, Request $request) {
            
            $order_id = $request->get('order_id');    $cl_ord_id = $request->get('cl_ord_id');    $text = $request->get('text');    
            return new Response('How about implementing order.cancel as a DELETE method ?');
            });

            

$app->DELETE('/order/all', function(Application $app, Request $request) {
            
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $text = $request->get('text');    
            return new Response('How about implementing order.cancelAll as a DELETE method ?');
            });

            

$app->PUT('/order/bulk', function(Application $app, Request $request) {
            
            $orders = $request->get('orders');    
            return new Response('How about implementing order.amendBulk as a PUT method ?');
            });

            

$app->POST('/order/bulk', function(Application $app, Request $request) {
            
            $orders = $request->get('orders');    
            return new Response('How about implementing order.newBulk as a POST method ?');
            });

            

$app->POST('/order/cancelAllAfter', function(Application $app, Request $request) {
            
            $timeout = $request->get('timeout');    
            return new Response('How about implementing order.cancelAllAfter as a POST method ?');
            });

            

$app->POST('/order/closePosition', function(Application $app, Request $request) {
            
            $symbol = $request->get('symbol');    $price = $request->get('price');    
            return new Response('How about implementing order.closePosition as a POST method ?');
            });

            
        
    
        
            

$app->GET('/apiKey', function(Application $app, Request $request) {
            $reverse = $request->get('reverse');    
            
            return new Response('How about implementing apiKey.get as a GET method ?');
            });

            

$app->POST('/apiKey', function(Application $app, Request $request) {
            
            $name = $request->get('name');    $cidr = $request->get('cidr');    $permissions = $request->get('permissions');    $enabled = $request->get('enabled');    $token = $request->get('token');    
            return new Response('How about implementing apiKey.new as a POST method ?');
            });

            

$app->DELETE('/apiKey', function(Application $app, Request $request) {
            
            $api_key_id = $request->get('api_key_id');    
            return new Response('How about implementing apiKey.remove as a DELETE method ?');
            });

            

$app->POST('/apiKey/disable', function(Application $app, Request $request) {
            
            $api_key_id = $request->get('api_key_id');    
            return new Response('How about implementing apiKey.disable as a POST method ?');
            });

            

$app->POST('/apiKey/enable', function(Application $app, Request $request) {
            
            $api_key_id = $request->get('api_key_id');    
            return new Response('How about implementing apiKey.enable as a POST method ?');
            });

            
        
    
        
            

$app->GET('/user', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing user.get as a GET method ?');
            });

            

$app->PUT('/user', function(Application $app, Request $request) {
            
            $firstname = $request->get('firstname');    $lastname = $request->get('lastname');    $old_password = $request->get('old_password');    $new_password = $request->get('new_password');    $new_password_confirm = $request->get('new_password_confirm');    $username = $request->get('username');    $country = $request->get('country');    $pgp_pub_key = $request->get('pgp_pub_key');    
            return new Response('How about implementing user.update as a PUT method ?');
            });

            

$app->POST('/user', function(Application $app, Request $request) {
            
            $email = $request->get('email');    $password = $request->get('password');    $username = $request->get('username');    $firstname = $request->get('firstname');    $lastname = $request->get('lastname');    $accepts_tos = $request->get('accepts_tos');    $referrer_id = $request->get('referrer_id');    $country = $request->get('country');    $tfa_type = $request->get('tfa_type');    $tfa_token = $request->get('tfa_token');    
            return new Response('How about implementing user.new as a POST method ?');
            });

            

$app->GET('/user/affiliateStatus', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing user.getAffiliateStatus as a GET method ?');
            });

            

$app->POST('/user/cancelWithdrawal', function(Application $app, Request $request) {
            
            $token = $request->get('token');    
            return new Response('How about implementing user.cancelWithdrawal as a POST method ?');
            });

            

$app->GET('/user/checkReferralCode', function(Application $app, Request $request) {
            $referral_code = $request->get('referral_code');    
            
            return new Response('How about implementing user.checkReferralCode as a GET method ?');
            });

            

$app->GET('/user/commission', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing user.getCommission as a GET method ?');
            });

            

$app->POST('/user/confirmEmail', function(Application $app, Request $request) {
            
            $token = $request->get('token');    
            return new Response('How about implementing user.confirmEmail as a POST method ?');
            });

            

$app->POST('/user/confirmEnableTFA', function(Application $app, Request $request) {
            
            $type = $request->get('type');    $token = $request->get('token');    
            return new Response('How about implementing user.confirmEnableTFA as a POST method ?');
            });

            

$app->POST('/user/confirmPasswordReset', function(Application $app, Request $request) {
            
            $token = $request->get('token');    $new_password = $request->get('new_password');    
            return new Response('How about implementing user.confirmPasswordReset as a POST method ?');
            });

            

$app->POST('/user/confirmWithdrawal', function(Application $app, Request $request) {
            
            $token = $request->get('token');    
            return new Response('How about implementing user.confirmWithdrawal as a POST method ?');
            });

            

$app->GET('/user/depositAddress', function(Application $app, Request $request) {
            $currency = $request->get('currency');    
            
            return new Response('How about implementing user.getDepositAddress as a GET method ?');
            });

            

$app->POST('/user/disableTFA', function(Application $app, Request $request) {
            
            $type = $request->get('type');    $token = $request->get('token');    
            return new Response('How about implementing user.disableTFA as a POST method ?');
            });

            

$app->POST('/user/login', function(Application $app, Request $request) {
            
            $email = $request->get('email');    $password = $request->get('password');    $token = $request->get('token');    
            return new Response('How about implementing user.login as a POST method ?');
            });

            

$app->POST('/user/logout', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing user.logout as a POST method ?');
            });

            

$app->POST('/user/logoutAll', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing user.logoutAll as a POST method ?');
            });

            

$app->GET('/user/margin', function(Application $app, Request $request) {
            $currency = $request->get('currency');    
            
            return new Response('How about implementing user.getMargin as a GET method ?');
            });

            

$app->POST('/user/preferences', function(Application $app, Request $request) {
            
            $prefs = $request->get('prefs');    $overwrite = $request->get('overwrite');    
            return new Response('How about implementing user.savePreferences as a POST method ?');
            });

            

$app->POST('/user/requestEnableTFA', function(Application $app, Request $request) {
            
            $type = $request->get('type');    
            return new Response('How about implementing user.requestEnableTFA as a POST method ?');
            });

            

$app->POST('/user/requestPasswordReset', function(Application $app, Request $request) {
            
            $email = $request->get('email');    
            return new Response('How about implementing user.requestPasswordReset as a POST method ?');
            });

            

$app->POST('/user/requestWithdrawal', function(Application $app, Request $request) {
            
            $otp_token = $request->get('otp_token');    $currency = $request->get('currency');    $amount = $request->get('amount');    $address = $request->get('address');    $fee = $request->get('fee');    
            return new Response('How about implementing user.requestWithdrawal as a POST method ?');
            });

            

$app->POST('/user/resendVerificationEmail', function(Application $app, Request $request) {
            
            $email = $request->get('email');    
            return new Response('How about implementing user.sendVerificationEmail as a POST method ?');
            });

            

$app->GET('/user/walletHistory', function(Application $app, Request $request) {
            $currency = $request->get('currency');    
            
            return new Response('How about implementing user.getWalletHistory as a GET method ?');
            });

            
        
    
        
            

$app->GET('/announcement', function(Application $app, Request $request) {
            $columns = $request->get('columns');    
            
            return new Response('How about implementing announcement.get as a GET method ?');
            });

            

$app->GET('/announcement/urgent', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing announcement.getUrgent as a GET method ?');
            });

            
        
    
        
            

$app->GET('/leaderboard', function(Application $app, Request $request) {
            $method = $request->get('method');    
            
            return new Response('How about implementing leaderboard.get as a GET method ?');
            });

            
        
    
        
            

$app->GET('/funding', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing funding.get as a GET method ?');
            });

            
        
    
        
            

$app->GET('/orderBook', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $depth = $request->get('depth');    
            
            return new Response('How about implementing orderBook.get as a GET method ?');
            });

            

$app->GET('/orderBook/L2', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $depth = $request->get('depth');    
            
            return new Response('How about implementing orderBook.getL2 as a GET method ?');
            });

            
        
    
        
            

$app->GET('/position', function(Application $app, Request $request) {
            $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    
            
            return new Response('How about implementing position.get as a GET method ?');
            });

            

$app->POST('/position/isolate', function(Application $app, Request $request) {
            
            $symbol = $request->get('symbol');    $enabled = $request->get('enabled');    
            return new Response('How about implementing position.isolateMargin as a POST method ?');
            });

            

$app->POST('/position/leverage', function(Application $app, Request $request) {
            
            $symbol = $request->get('symbol');    $leverage = $request->get('leverage');    
            return new Response('How about implementing position.updateLeverage as a POST method ?');
            });

            

$app->POST('/position/transferMargin', function(Application $app, Request $request) {
            
            $symbol = $request->get('symbol');    $amount = $request->get('amount');    
            return new Response('How about implementing position.transferIsolatedMargin as a POST method ?');
            });

            
        
    
        
            

$app->GET('/schema', function(Application $app, Request $request) {
            $model = $request->get('model');    
            
            return new Response('How about implementing schema.get as a GET method ?');
            });

            

$app->GET('/schema/websocketHelp', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing schema.websocketHelp as a GET method ?');
            });

            
        
    
        
            

$app->GET('/quote', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing quote.get as a GET method ?');
            });

            

$app->GET('/quote/bucketed', function(Application $app, Request $request) {
            $bin_size = $request->get('bin_size');    $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing quote.getBucketed as a GET method ?');
            });

            
        
    
        
            

$app->GET('/settlement', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing settlement.get as a GET method ?');
            });

            
        
    
        
            

$app->GET('/trade', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing trade.get as a GET method ?');
            });

            

$app->GET('/trade/bucketed', function(Application $app, Request $request) {
            $bin_size = $request->get('bin_size');    $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing trade.getBucketed as a GET method ?');
            });

            
        
    
        
            

$app->GET('/execution', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing execution.get as a GET method ?');
            });

            

$app->GET('/execution/tradeHistory', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing execution.getTradeHistory as a GET method ?');
            });

            
        
    
        
            

$app->GET('/insurance', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing insurance.get as a GET method ?');
            });

            
        
    
        
            

$app->GET('/chat', function(Application $app, Request $request) {
            $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    
            
            return new Response('How about implementing chat.get as a GET method ?');
            });

            

$app->POST('/chat', function(Application $app, Request $request) {
            
            $message = $request->get('message');    
            return new Response('How about implementing chat.new as a POST method ?');
            });

            

$app->GET('/chat/connected', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing chat.getConnected as a GET method ?');
            });

            
        
    
        
            

$app->GET('/instrument', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing instrument.get as a GET method ?');
            });

            

$app->GET('/instrument/active', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing instrument.getActive as a GET method ?');
            });

            

$app->GET('/instrument/activeAndIndices', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing instrument.getActiveAndIndices as a GET method ?');
            });

            

$app->GET('/instrument/activeIntervals', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing instrument.getActiveIntervals as a GET method ?');
            });

            

$app->GET('/instrument/indices', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing instrument.getIndices as a GET method ?');
            });

            
        
    
        
            

$app->GET('/stats', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing stats.get as a GET method ?');
            });

            

$app->GET('/stats/history', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing stats.history as a GET method ?');
            });

            
        
    
        
            

$app->GET('/liquidation', function(Application $app, Request $request) {
            $symbol = $request->get('symbol');    $filter = $request->get('filter');    $columns = $request->get('columns');    $count = $request->get('count');    $start = $request->get('start');    $reverse = $request->get('reverse');    $start_time = $request->get('start_time');    $end_time = $request->get('end_time');    
            
            return new Response('How about implementing liquidation.get as a GET method ?');
            });

            
        
    

$app->run();
