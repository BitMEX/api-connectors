using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class User {
    public double? id { get; set; }

    public string firstname { get; set; }

    public string lastname { get; set; }

    public string status { get; set; }

    public string username { get; set; }

    public string email { get; set; }

    public string phone { get; set; }

    public double? countryCode { get; set; }

    public DateTime? created { get; set; }

    public DateTime? lastUpdated { get; set; }

    public object preferences { get; set; }

    public string role { get; set; }

    public string TFAEnabled { get; set; }

    public string affiliateID { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class User {\n");
      sb.Append("  id: ").Append(id).Append("\n");
      sb.Append("  firstname: ").Append(firstname).Append("\n");
      sb.Append("  lastname: ").Append(lastname).Append("\n");
      sb.Append("  status: ").Append(status).Append("\n");
      sb.Append("  username: ").Append(username).Append("\n");
      sb.Append("  email: ").Append(email).Append("\n");
      sb.Append("  phone: ").Append(phone).Append("\n");
      sb.Append("  countryCode: ").Append(countryCode).Append("\n");
      sb.Append("  created: ").Append(created).Append("\n");
      sb.Append("  lastUpdated: ").Append(lastUpdated).Append("\n");
      sb.Append("  preferences: ").Append(preferences).Append("\n");
      sb.Append("  role: ").Append(role).Append("\n");
      sb.Append("  TFAEnabled: ").Append(TFAEnabled).Append("\n");
      sb.Append("  affiliateID: ").Append(affiliateID).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
