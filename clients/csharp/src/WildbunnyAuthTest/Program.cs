using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace WildbunnyAuthTest
{
	class Program
	{
		const string kBasePath = "https://www.bitmex.com/api/v1/";

		static void Main(string[] args)
		{
			if (args.Length < 2)
			{
				Console.WriteLine("Usage: WildbunnyAuthTest.exe <api key> <api secret>");
				Console.ReadLine();
			}
			else
			{
				string apiKey = args[0];
				string apiSecret = args[1];

				ApiClient client = new ApiClient(kBasePath);
				Configuration config = new Configuration(client, null, null, null, null, new Dictionary<string, string> { { apiKey, apiSecret } });

				UserApi userApi = new UserApi(config);
				PositionApi posApi = new PositionApi(config);

				client.Configuration = config;

				string depositAddress = userApi.UserGetDepositAddress();
				List<Position> positions = posApi.PositionGet();

				Console.WriteLine("depositAddress = " + depositAddress);
				Console.Write("open positions = ");
				foreach (Position p in positions)
				{
					Console.WriteLine(p.Currency + " " + p.CurrentQty);
				}
			}
		}
	}
}
