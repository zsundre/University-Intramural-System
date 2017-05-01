SELECT FName, LName
FROM csoderstrom.Students, csoderstrom.Refs
WHERE Refs.StudentID = Students.StudentID;