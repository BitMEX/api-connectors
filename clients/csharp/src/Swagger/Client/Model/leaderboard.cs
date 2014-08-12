using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class Leaderboard {
    public string username { get; set; }

    public double? marginBalance { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Leaderboard {\n");
      sb.Append("  username: ").Append(username).Append("\n");
      sb.Append("  marginBalance: ").Append(marginBalance).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
