using BitMEX;
using System;

namespace Test
{
    internal class Program
    {
        private static string bitmexKey = "6t0mnAJbqEAmCdkJkFQPjeEc";
        private static string bitmexSecret = "sB-QNM5_SaY81hE9mOFCthEiXP-1D4jZKV5JIDp7m4omHC4G";

        private static void Main(string[] args)
        {
            Program p = new Program();
            p.Run(args);
        }

        private void Run(string[] args)
        {
            BitMEXApi bitmex = new BitMEXApi(bitmexKey, bitmexSecret);
            // var orderBook = bitmex.GetOrderBook("XBT24H", 3);
            var orders = bitmex.GetOrders();
            Console.WriteLine(orders);
        }
    }
}
