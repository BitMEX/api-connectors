using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class ApiKey {
    public string id { get; set; }

    public string secret { get; set; }

    public string name { get; set; }

    public double? nonce { get; set; }

    public string cidr { get; set; }

    public object constriants { get; set; }

    public bool? enabled { get; set; }

    public double? userId { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ApiKey {\n");
      sb.Append("  id: ").Append(id).Append("\n");
      sb.Append("  secret: ").Append(secret).Append("\n");
      sb.Append("  name: ").Append(name).Append("\n");
      sb.Append("  nonce: ").Append(nonce).Append("\n");
      sb.Append("  cidr: ").Append(cidr).Append("\n");
      sb.Append("  constriants: ").Append(constriants).Append("\n");
      sb.Append("  enabled: ").Append(enabled).Append("\n");
      sb.Append("  userId: ").Append(userId).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
