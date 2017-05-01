SELECT FName, LName
FROM csoderstrom.Students, csoderstrom.Players
WHERE Players.StudentID = Students.StudentID;