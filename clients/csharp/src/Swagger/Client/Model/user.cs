using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;

namespace Swagger.Client.Model {
  public class User {
    public string firstname { get; set; }

    public string lastname { get; set; }

    public string username { get; set; }

    public string email { get; set; }

    public bool? emailVerified { get; set; }

    public string phone { get; set; }

    public bool? phoneVerified { get; set; }

    public string status { get; set; }

    public DateTime? created { get; set; }

    public DateTime? lastUpdated { get; set; }

    public AnonymousModel_6 preferences { get; set; }

    public bool? isEmployee { get; set; }

    public double? id { get; set; }

    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class User {\n");
      sb.Append("  firstname: ").Append(firstname).Append("\n");
      sb.Append("  lastname: ").Append(lastname).Append("\n");
      sb.Append("  username: ").Append(username).Append("\n");
      sb.Append("  email: ").Append(email).Append("\n");
      sb.Append("  emailVerified: ").Append(emailVerified).Append("\n");
      sb.Append("  phone: ").Append(phone).Append("\n");
      sb.Append("  phoneVerified: ").Append(phoneVerified).Append("\n");
      sb.Append("  status: ").Append(status).Append("\n");
      sb.Append("  created: ").Append(created).Append("\n");
      sb.Append("  lastUpdated: ").Append(lastUpdated).Append("\n");
      sb.Append("  preferences: ").Append(preferences).Append("\n");
      sb.Append("  isEmployee: ").Append(isEmployee).Append("\n");
      sb.Append("  id: ").Append(id).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }
  }
  }
