<img src="https://assets.cloudacademy.com/manual_uploaded/transactional-emails/qa/logo.svg" alt="QA Logo" width="200"/>

---


# MyIndoorGarden

To create a Spring Boot API, with utilisation of supporting tools, methodologies, and technologies, that encapsulates all fundamental and practical modules covered during training in QA Bootcamp.

### Why are we doing this?

Indoor plants have become more popular recently.
For aesthetic reasons or not, they are natural humidifiers to improve air quality indoors. 
They can also help improve one's mental health and well-being.

MyIndoorGarden application is designed to:
- be a functional database for your indoor plants (Create, Read, Update and Delete data)
- provide information of your indoor plants (Country of origin, number of plants, plant name)
- set reminder to water your plants (watering frequency set in number of days)

### How I expected the challenge to go.

I expect this task to be fun yet challenging. 
This is a task that gives us a glimpse of how it is like be a software developer in the industry.

### What went well? / What didn't go as planned?

Success: Jira planning board, the h2 database integration data persistence, github feature branching and the coding/testing in general

Could have: I could have done more of the stretch goals but due to unforeseen circumstance, I have partially encountered risk#2 in my risk assessment.

### Possible improvements for future revisions of the project.
- SOLID principle could be applied, I have repeated some codes in the test file and in the controller file.
- Some of the stretch goals could be attained.
- Realising that eclipse/spring doesn't automatically refresh files when pushed/pulled from gitHub.
- Should have understood the feature branching a lot sooner

### Screenshots showing your postman requests and the output from the API.

Link: https://imgur.com/a/UIfsQPN

For ease of development: (JSONFields.txt file is available to use in root folder)
- I have used `$randomWord` for my plant name
- I have used `$randomInt` for plant quantity
- I have used `$randomColour` for plant colour
- I have used `$randomCountry` for plant countryOfOrigin
- I have set `wateringFrequency` as 7 days default

### Screenshots of your database to prove that data is being persisted.

#### 1.) Feature Create:
![Database Result](https://i.imgur.com/adplomb.png)

#### 2.) Feature Get All:
![Database Result](https://i.imgur.com/Qyf2XYp.png)

#### 3.) Feature Get by ID:
![Database Result](https://i.imgur.com/O11p86A.png)

#### 4.) Feature Edit:
![Database Result](https://i.imgur.com/XJDh1Qb.png)

#### 5.) Feature Delete by ID:
![Database Result](https://i.imgur.com/XTvVjcw.png)

### Screenshot of your test results, including coverage report.

![Test Result](https://i.imgur.com/AV6TXw0.png)

#### Link to Jira Board - You must add Richard as collaborators on your Jira board.

[Jira Board - Atlassian](https://xavvy.atlassian.net/jira/software/projects/IG/boards/4/backlog?sprintCompleted)
