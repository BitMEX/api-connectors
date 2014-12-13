using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class AccessToken {
    public string id { get; set; }

    /* time to live in seconds (2 weeks by default) */
    public double? ttl { get; set; }

    public DateTime? created { get; set; }

    public double? userId { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AccessToken {\n");
      sb.Append("  id: ").Append(id).Append("\n");
      sb.Append("  ttl: ").Append(ttl).Append("\n");
      sb.Append("  created: ").Append(created).Append("\n");
      sb.Append("  userId: ").Append(userId).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
