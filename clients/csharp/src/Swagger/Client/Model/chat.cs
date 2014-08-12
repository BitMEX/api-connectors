using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Chat {
    public double? id { get; set; }

    public DateTime? date { get; set; }

    public string user { get; set; }

    public string message { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Chat {\n");
      sb.Append("  id: ").Append(id).Append("\n");
      sb.Append("  date: ").Append(date).Append("\n");
      sb.Append("  user: ").Append(user).Append("\n");
      sb.Append("  message: ").Append(message).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
