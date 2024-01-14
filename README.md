Full Stack Java Application
![Github License](https://img.shields.io/badge/license-MIT-yellowgreen.svg)

# *This project is in its Alpha stage*

## Project Background 📝

Shif

A common process

The 


## Table of Contents 🗒

* [Milestones](#milestones-💻)

    * [Milestone 1](#milestone-1)
    * [Milestone 2](#milestone-2)
    * [Milestone 3](#milestone-3)
    * [Milestone 4](#milestone-4)
    * [Milestone 5](#milestone-5)
    * [Milestone 6](#milestone-6)

* [License](#license-📛)

* [Contributors](#contributors-😃)

* [Questions](#questions)
## Milestones  💻

### Milestone 1

This m

---

### Milestone 2

In t

* 


  ---

### Milestone 3

Once


Th

T
---

### Milestone 4

Wi

* **Data Loss Simulation** : Based on 

![Alt text](./img/Step_04.png)

* **Restoration** : Once the vital 

For 


---

### Milestone 5

Havi
* **XX** : First

![Alt text](img/replica.png)

A k

![Alt text](img/region.png)

* **Failover Setup** : in order to initiate the failover, the server in the primary region (UK) was linked with the geo-replicated US server. The failover was setup as shown.

![Alt text](img/failover.png)

Initialy, the UK server is set as the primary server and the US as the secondary. Once failover initiated, the roles are swaped as shown.

![Alt text](img/failover_2.png)


---

### Milestone 6

The migration is completed, it is time that business presents the front-end PowerBI reports based on the data to the business. Some staff require further access to Azure based resources or be able to read the database and give their own insights. It then becomes imperative for the cloud engineer to manage the security of user identities and their access to the relevant resources on the cloud. As part of security and access management, the `Microsoft Entra ID` access provides user authentication, authorization and access management. This milestone aims at integrating Microsoft Entra Directory with the Azure SQL Database. Firstly, it begins by developing first an admin account that oversees the entire production database. and restricting users to `read-only` access to the database. Secondly, it will also set up a seperate database reader account, allowing users to read but not modify data. This is crucial in a production setting where accuracy is key. Restricted access prevents accidental changes, ensuring the team gets needed insights safely.


* **Configure Microsoft Entra ID for Azure SQL Database** : first, the Microsoft Entra ID authentication was setup for the SQL Server hosting the Azure SQL production database. A seperate account with admin priveleges was setup. The following was confirmed by connecting the production database using Microsoft Entra credentials in Azure Data Studio. The sample of the accomplished task is shown below.

![Alt text](img/entra_admin.png)


* **Setting Up The Read-Only Database and Connecting to Azure Data Studio** : to commence the process, a new user account was generated in Microsoft Entra ID, serving as the DB Reader user. In Azure Data Studio, the connection to the production database was established using the Microsoft Entra admin credentials. Following this, the db_datareader role was assigned to the previously generated DB Reader User, granting them read-only privileges. Subsequently, there was a reconnection to the production database using Azure Data Studio and the credentials of the new DB Reader AD user. A test of the user's permissions was conducted to verify that the correct role had been assigned. This is shown below.

![Alt text](img/EntraID-Evidence.png)

### Lessons Learned From the Project

With limited experience in cloud services, the project faced a major issue in our rising costs due to unused resources and inefficient provisioning. The unpredictable workload made it hard to estimate resource needs, leading to overspending.

To tackle this, the option of auto-scaling was explored. This adjusted resources based on demand. By setting up auto-scaling policies, it was found that the system scaled up during busy times and scaled down during quiet periods. This not only boosted efficiency but also cut costs significantly during off-peak hours.

Throughout the project, the pricing model and reserved instances for workloads regularly reviewed and optimized. This strategic approach, combined with continuous monitoring, helped us find a balance between performance and cost-effectiveness.

These measures allowed the project to achieve substantial cost savings without compromising performance or scalability. This experience emphasized the importance of ongoing cost management and the need to adapt strategies based on changing workload patterns in a dynamic cloud environment.


## License 📛

Copyright @ MIT. All rights reserved.

Licensed under the MIT license.

## Contributors

Mahed Javed - ksfmahed@outlook.com

## Questions

For additional questions, contact me at the email provided below.

- GitHub: [mahedjaved](https://github.com/mahedjaved/)
- Email:  mahed95@gmail.com